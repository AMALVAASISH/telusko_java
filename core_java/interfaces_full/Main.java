package core_java.interfaces_full;

// abstract class replaced here
// alternative for class which only has abstract methods - interface

interface A{
    void show();
    void config();
}// by default every method is public abstract

// interface just show the design, we have to do it

class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}

// implements is used incase of interface
// if class B does not define the methods, it also become an abstract class


public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}

// 8.29.51
// looking into variables,just started

