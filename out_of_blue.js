// MQTT client module for handling device status updates

class MQTTClient {
    constructor(config) {
        this.config = config;
        this.client = null;
        this.connectionStatus = 'disconnected';
        this.onStatusChangeCallback = null; 
        this.onMessageCallback = null;
        this.heartbeatInterval = null;
        
        // Track received payload types in this message cycle
        this.receivedPayloadTypes = {
            locations: false,
            cams: false,
            dis_c: false, 
            dis_v: false,
            servers: false
        };
    }
    
    // Connect to MQTT broker
    connect() {
        try {
            console.log('Connecting to MQTT broker...');
            this._updateStatus('connecting');
            
            this.client = mqtt.connect(this.config.brokerUrl, {
                clientId: this.config.clientId,
                username: this.config.username,
                password: this.config.password,
                keepalive: 60,
                reconnectPeriod: 5000
            });
            
            // Set up event handlers
            this.client.on('connect', () => this._onConnect());
            this.client.on('message', (topic, message) => this._onMessage(topic, message));
            this.client.on('error', (error) => this._onError(error));
            this.client.on('offline', () => this._onOffline());
            this.client.on('reconnect', () => this._onReconnect());
            this.client.on('close', () => this._onClose());
            
            return true;
        } catch (error) {
            console.error('Failed to connect to MQTT broker:', error);
            this._updateStatus('error');
            return false;
        }
    }
    
    // Disconnect from MQTT broker
    disconnect() {
        if (this.client) {
            this._stopHeartbeat();
            this.client.end();
            this.client = null;
            this._updateStatus('disconnected');
        }
    }
    
    // Register callback for status changes
    onStatusChange(callback) {
        this.onStatusChangeCallback = callback;
    }
    
    // Register callback for received messages
    onMessage(callback) {
        this.onMessageCallback = callback;
    }
    
    // Check if client is connected
    isConnected() {
        return this.client && this.client.connected;
    }
    
    // Private: Connection event handler
    _onConnect() {
        console.log('Connected to MQTT broker');
        this.connectionStatus = 'connected';
        this._updateStatus('connected');
        
        // Subscribe to all required topics
        this.config.topics.forEach(topic => {
            this.client.subscribe(topic, (err) => {
                if (err) {
                    console.error('Error subscribing to ${topic}:, err');
                } else {
                    console.log('Subscribed to ${topic}');
                }
            });
        });
        
        // Publish connection notification
        this.client.publish('csml/browser', navigator.userAgent);
        
        // Start heartbeat
        this._startHeartbeat();
    }
    
    // Private: Message event handler
    _onMessage(topic, message) {
        try {
            const messageStr = message.toString();
            console.log(`Message received on ${topic}:, 
                messageStr.length < 2048 ? messageStr : ${messageStr.length} bytes`);
            
            // Clean the message string
            const cleanedMessageStr = messageStr.replace(/[\n\r\t]/g, '');
            
            // Parse the cleaned JSON
            const payload = JSON.parse(cleanedMessageStr);
            
            // Check if this is the first message in a new update cycle
            if (this._isFirstMessageInCycle(topic, payload)) {
                // Reset received payload types tracker for a new cycle
                this._resetReceivedPayloadTypes();
            }
            
            // Call the message callback if registered
            if (this.onMessageCallback) {
                this.onMessageCallback(topic, payload);
            }
            
        } catch (error) {
            console.error('Error processing message:', error);
            console.log('Problem message:', message.toString());
        }
    }
    
    // Private: Check if this is the first message in a new update cycle
    _isFirstMessageInCycle(topic, payload) {
        // If this is a locations message, it's the start of a cycle
        if (topic === 'csml/status/locations/offline') {
            return true;
        }
        
        // If all payload types were previously marked as received, this is a new cycle
        const allReceived = Object.values(this.receivedPayloadTypes).every(value => value === true);
        if (allReceived) {
            return true;
        }
        
        return false;
    }
    
    // Private: Reset received payload types tracker
    _resetReceivedPayloadTypes() {
        this.receivedPayloadTypes = {
            locations: false,
            cams: false,
            dis_c: false, 
            dis_v: false,
            servers: false
        };
    }
    
    // Private: Error event handler
    _onError(error) {
        console.error('MQTT error:', error);
        this._updateStatus('error');
    }
    
    // Private: Offline event handler
    _onOffline() {
        console.log('MQTT client is offline');
        this.connectionStatus = 'disconnected';
        this._updateStatus('disconnected');
    }
    
    // Private: Reconnect event handler
    _onReconnect() {
        console.log('Attempting to reconnect to MQTT broker...');
        this._updateStatus('connecting');
    }
    
    // Private: Close event handler
    _onClose() {
        console.log('MQTT connection closed');
        this.connectionStatus = 'disconnected';
        this._updateStatus('disconnected');
        this._stopHeartbeat();
    }
    
    // Private: Update connection status
    _updateStatus(status) {
        this.connectionStatus = status;
        if (this.onStatusChangeCallback) {
            this.onStatusChangeCallback(status);
        }
    }
    
    // Private: Start heartbeat
    _startHeartbeat() {
        if (this.heartbeatInterval) {
            clearInterval(this.heartbeatInterval);
        }
        
        this.heartbeatInterval = setInterval(() => {
            if (this.client && this.client.connected) {
                this.client.publish('csml/heartbeat', navigator.userAgent);
            }
        }, 60000); // Every minute
        
        console.log('Heartbeat started');
    }
    
    // Private: Stop heartbeat
    _stopHeartbeat() {
        if (this.heartbeatInterval) {
            clearInterval(this.heartbeatInterval);
            this.heartbeatInterval = null;
            console.log('Heartbeat stopped');
        }
    }
}

// Export the class
window.MQTTClient = MQTTClient;