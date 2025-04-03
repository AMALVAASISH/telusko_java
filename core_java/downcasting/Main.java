package core_java.downcasting;

class A{
    public void show(){
        System.out.println("on A show");
    }
        
}

class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = (A) new B();

        // this means refer to A
        //up casting
        obj.show();
        // this happens implicitly , behind the scenes

        B obj1 = (B) obj;
        // down casting
        obj1.show2();
        obj1.show();
        
    }
}
