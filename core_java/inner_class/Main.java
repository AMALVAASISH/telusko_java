package core_java.inner_class;

// class A{

//     int age;
//     public void show(){
//         System.out.println("in show");
//     }
//     class B{
//         public void config(){
//             System.out.println("in config");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.show();

//         A.B obj1 = obj.new B();
//         // B belongs to A, so its object is used
//         obj1.config();


//         // if class B is static, static class B
//         // A.B obj2 = new A.B(); // this will work
//     }
// }

// static can be used only for inner class


// class inside class - inner class

// 8.07.00 hr mn ss

// class A{
//     public void show(){
//         System.out.println("in A show");
//     }
// }

// // class B extends A{
// //     public void show(){
// //         System.out.println("in B show");
// //     }
// // }

// // if class B is just created for just over riding  method
// //its not that much needed
// // instead this below can be done


// public class Main{
//     public static void main(String[] args) {
//         // A obj = new B();// this below is done
//         A obj = new A(){
//             public void show(){
//                 System.out.println("in new show");
//             }
//         };// a  new implementation is provided here
//         // this is an inner class
//         // anonymous inner class
//         obj.show();// call show() of new implementation
//     }
// }

///=======================
/// 
/// 

abstract class A{
    public abstract void show();
}

// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }
// here also this is just created to run this func,
// it can be done with inner class


public class Main{
    public static void main(String[] args) {
        // B obj = new B();
        // obj.show();

        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            } 
        };// implementation can be done with abstract class also
        // we are getting object of anonymous inner class
        // usually used for implementing things once
        
        obj.show();

    }
}