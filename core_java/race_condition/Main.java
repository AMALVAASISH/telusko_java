package core_java.race_condition;

// mutation - changing value of primitive value variables
// combining mutation with thread can cause some problems

// this can be avoided with thread safe
// by allowing only one thread to access a method at a time


// class Counter{
//     int count;// value 0 since instance variable

//     public void increment(){
//         count++;
//     }
// }


class Counter{
    int count;// value 0 since instance variable

    public synchronized void increment(){
        count++;
    }
}

public class Main {
    public static void main(String[] args) {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i = 0;i<=1000;i++){
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i = 0;i<=1000;i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // System.out.println(c.count);
        // // here 2000 is not the value we get,
        // // and this value goes on varying
        // // this is bcoz the threads have not completed executing

        try{    
            t1.join();
            t2.join();
        }catch(Exception e){

        }

        System.out.println(c.count);
        // this will also not give a constant value always
        // we cannot directly control threads

        // both threads call the methods at the same time
        // so it will be implemented only once

        // this can be avoided by using
        // synchronized in the method, it will make the 
        // only one thread to work on increment at a time



    }
}
