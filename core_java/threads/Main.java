package core_java.threads;

class A extends Thread // this is done to make a thread
{
    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("hi");
        }
        
    }
}

class B extends Thread
{
    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("hello");
        }
        
    }
}

class C extends Thread{
    public void run()
    {
        for(int i = 1;i<=10;i++){
            System.out.println("C");
            try {
                Thread.sleep(10);
                // thread waiting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class D extends Thread{
    public void run()
    {
        for(int i = 1;i<=10;i++){
            System.out.println("D");
            try {
                Thread.sleep(10);
                // thread waiting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class E implements Runnable {
    public void run()
    {
        for(int i = 1;i<=10;i++){
            System.out.println("E");
            try {
                Thread.sleep(10);
                // thread waiting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class F implements Runnable {
    public void run()
    {
        for(int i = 1;i<=10;i++){
            System.out.println("F");
            try {
                Thread.sleep(10);
                // thread waiting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Main {
    public static void main(String[] args){
        // in the same program , u can have multiple tasks 
        // running at the same time
        // that is ,  threads

        // A obj1 = new A();
        // B obj2 = new B();

        // obj1.start();// thread is started using this
        // obj2.start();
        // // this .start() will call the run method

        // // now the processes are running in parallel

        // // there is a scheduler in os, which is responsible
        // // for allowing a thread to execute based on the core available

        // System.out.println(obj1.getPriority());
        // // this gives the priority 
        // // ranges from 1 to 10, 1 is least
        // // by defalut, all will have normal priority,that is 5

        // obj1.setPriority(Thread.MAX_PRIORITY);
        // // we can suggest this with what should be done
        // //with max priority


        // we can set sleep in thread to tell the thread to wait the 
        // thread execution


        // C obj3 = new C();
        // D obj4 = new D();

        // obj3.start();
        // obj4.start();

        // two threads can go back to the scheduler at the same time
        // so the alternate printing may change

        // to avoid that, u can introduce a thread.sleep after the 
        // first thread starting

        // obj3.start();
        // try{
        //     Thread.sleep(2);
        // }catch(InterruptedException e){

        // }
        // obj4.start();

        // multiple inheritance is not supported in java
        // so we cannot extends Thread and some other class at the same time
        // so we do implements

        // Runnable obj5 = new E();
        // Runnable obj6 = new F();

        // Thread t1 = new Thread(obj5);
        // Thread t2 = new Thread(obj6);

        // t1.start();
        // t2.start();

        // anonymous class
        
        // Runnable obj7 = new Runnable() {
        //     public void run(){
        //         {
        //             for(int i = 1;i<=10;i++){
        //                 System.out.println("F");
        //                 try {
        //                     Thread.sleep(10);
        //                     // thread waiting
        //                 } catch (InterruptedException e) {
        //                     e.printStackTrace();
        //                 }
        //             }
        //         }
        //     }
        // };

        // lambda expression can be done for functionalinterface
        // runnalbe is a functionalinterface
                
        Runnable obj7 = () ->
                {
                    for(int i = 1;i<=10;i++){
                        System.out.println("F");
                        try {
                            Thread.sleep(10);
                            // thread waiting
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            };

        // there is no need to create a class,to run a thread
        
        Thread t3 = new Thread(obj7);
        t3.start();
    }
}
