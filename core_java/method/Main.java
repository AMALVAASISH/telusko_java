package core_java.method;

class A{
    public void show(){
        System.out.println("in A");
    }

}

class B extends A{
    public void show(){
        System.out.println("in B");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj  = new B();
        obj.show();
    }
}

// this is method over riding, the obj calls the method inside B rather A

