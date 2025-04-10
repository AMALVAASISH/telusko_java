package core_java.typesof_interfaces;

// types of interface
// normal , functional(SAM), marker

// normal has just declarations of methods and not definition


// SAM - single abstract method

// marker has no methods, it is update somthing to the compiler

// serialisation  - storing of values of objects on a hard disk from
// the heap memory
// this can be done by using marker interface


// 9.05.55 functional interface starting


// this is SAM

/// by using annotation we are making sure it 
/// is a functional interface


// @FunctionalInterface
// interface A{
//     void show();
// }

// // class B implements A{
// //     public void show(){
// //         System.out.println("in show");
// //     }
// // }

// public class Main{
//     public static void main(String[] args) {
//         // A obj = new B();
//         // obj.show();
//         // either this way by creating class B 
//         // or

//         // anonymous inner class
//         // instantiate A by implementing its own implementation inner class
//         A obj = new A(){
//             public void show(){
//                 System.out.println("in show");
//             }
//         };
//         obj.show();
//     }
// }

// lambda expression can only be used with functional interface



// @FunctionalInterface
// interface A{
//     void show(int i);
// }

// public class Main{
//     public static void main(String[] args) {

//         // this is lambda expression, the other things were removed since
//         // the compiler already knows what would be there
//         // bts, teh new A() { func } everything is done by the compiler


//         // A obj = () -> {
//         //     System.out.println();
//         // };
//         // syntax , if no value was being passed


//         A obj = (i) -> { // int i is for receiving the value
//             // int is removed bcoz the type is already knowm
//             // we can remove the () also if we want

//                 System.out.println("in show");
//             // remove {} if there is only one line
//         };
//         obj.show(1);
//     }
// }


// due to lambda expression the file size of java file will increasse
// but it will not create .class file for anonymous inner class
// so less number of files to handle

@FunctionalInterface
interface A{
    int add(int i, int j);
}

public class Main{
    public static void main(String[] args) {
        // A obj = new A(){
        //     public int add(int i, int j){
        //         return i+j;
        //     }
        // };

        A obj = (i, j) -> {
                return i+j;
        };

        // return should be removed, if writing inline without the {}


        int result = obj.add(5,4);
        System.out.println(result);
    }
}