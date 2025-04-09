package core_java.interfaces_full;

// abstract class replaced here
// alternative for class which only has abstract methods - interface

// interface A{
//     void show();
//     void config();
// }// by default every method is public abstract

// // interface just show the design, we have to implement them 

// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
//     public void config(){
//         System.out.println("in config");
//     }
// }

// // implements is used incase of interface
// // if class B does not define the methods, it also become an abstract class


// public class Main {
//     public static void main(String[] args) {
//         A obj = new B();
//         obj.show();
//     }
// }

// 8.29.51
// looking into variables,just started


interface A{
    int age = 44;    
    // by default variables are,final and static
    String area = "Mumbai";
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{
    // method are inherited
    // so must be defined in the class B

}

class B implements A,X{
    // one class can implement multiple interfaces

    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        System.out.println(A.area);


        X obj1 = new B();
        obj1.run();
        // without the reference to interface X, the
        // method run cannot be called with obj from B
        
    }
}

// interface dont have their own memory in the heap


// class -> class = extends

// class -> interface = implements

// interface -> interface = extends