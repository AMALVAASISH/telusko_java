package core_java.basics_oops;


// class Calc{
//     public void add(){
//         System.out.println("addition has been called");
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         // objects = properties and behaviours, objects are created by jvm, they take blueprint from class
        
//         //class - blueprint for creating objects, 

//         Calc obj = new Calc();
//         obj.add();
//     }
// }




// inside the jdk, there is jre and inside it there is jvm
// jvm is used to run the byte code
// jre is place where the code is run, it verifies the byte code 
// and also contains the other files and classes needed
// for running the code inside the jvm
// in other computers, not developers, there is no jdk, just jre and jvm


// class Computer{
//     public String playMusic(){
//         System.out.println("playing musix");
//         return "chamak chelo";
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Computer obj = new Computer();
//         String returnValue = obj.playMusic();  
//         System.out.println(returnValue); 
//     }
// }

// method overloading


// class Calculator{
//     public int add(int a,int b){
//         return a+b;
//     }
//     public int add(int a,int b,int c){
//         return a+b+c;
//     }

//     public double add(double a,int b){
//         return a+b;
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Calculator obj = new Calculator();
//         obj.add(0, 0,9);
//     }
// }

// stack and heap

// every method has its own stack

class Calculator{
    int num; // instance variable

    public int add(int n1,int n2){ // local variables
        return n1+n2;
    }
}

public class Main{
    public static void main(String[] args){


        int data = 10; // local variables
        Calculator obj = new Calculator();
        int r1 = obj.add(1,2);



        // this below is just to show that two objects can have different values
        Calculator obj1 = new Calculator();
        obj.num = 8;

        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(data+r1+ "just to avoid the warnings");
        // there is change in the values of the objects since they are different objects

    }
}

// there is stack and heap

// when the method is executed, the local variables and value get stored inside the stack, 
// when the r1 value has to come
// another stack for the calculator method is created and the variable, value is stored there

// the new Calculator() is used for creating the object and the object resides inside the heap memory

// obj in the code is stll a reference variable, thats why its shown in the stack memory

// the instance variable and value are also stored in the heap memory, also the methods

// the code execution occurs inside the area in the stack

// 101 is the address of the object which resides inside the heap, there is like a link between stack and heap

