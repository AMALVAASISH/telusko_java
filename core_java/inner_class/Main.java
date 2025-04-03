package core_java.inner_class;

class A{

    int age;
    public void show(){
        System.out.println("in show");
    }
    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        // B belongs to A, so its object is used
        obj1.config();


        // if class B is static, static class B
        // A.B obj2 = new A.B(); // this will work
    }
}

// static can be used only for inner class


// class inside class - inner class

// 8.07.00 hr mn ss

