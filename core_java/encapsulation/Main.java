package core_java.encapsulation;

class Human{
    private int age;// private makes it acessible in the 
    // same class

    private String Name;
    //everytime make instance variable private(important)
    // they can be accessed via methods
     
    //means variable are encapsulated with methods

    public int getAge(){
        return age;
    }
    public String getName(){
        return Name; 
    }

    public void setAge(int a){
        age = a;// setting value can be done like this
    }

    public void setName(String nams){
        Name = nams;
    }
}

public class Main {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 24;// not accesible
        // obj.Name = "Amal";// not accesible
        obj.setAge(12);
        System.out.println(obj.getAge());;
    }
}

// getters and setters 
// for gettting and setting value 
// right click on source action and select setters and getters
// choose the variables , and they are created


// class Human{
//     private int age;// instance variables
//     private String name;

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }
//     // these are created are by the earlier action
//     // via this method, the this. keyword is used

//     // this. is used so that it is used to reference 
//     // instance variable and not the local variable


//     // instead of that , another way is also possible below
//     public void setName(String nams, Human obj){
//         Human obj1 = obj;
//         obj1.name = nams;
//         // this si the way of differentiating instance
//         // and local variable

//     }

//     // this whole process of passing object can be avoided
//     //by using this. keyword(it represents current method calling object)
// }

// public class Main{
//     public static void main(String[] args){
//         Human obj = new Human();
//         obj.setAge(11);
//         obj.setName("amal",obj);
//     }
// }



// CONSTRUCTORS ==========================================

// when i want values in the variables ,when objects are created
// constructor helps

// class Human{
//     private int age;
//     private String name;

//     // always perform operations in methods

//     // default constructor

//     // public Human(){// special method, same name as class
//     //     // never returns anything
//     //     // called when objects are created

//     //     age = 99;
//     //     name = "amal";

//     // }

//     // values can be passed to constructor also

//     public Human(int a, String b){// parameterised constructor

//         age = a;
//         name = b;// this keyword isnot used, bcoz the names are not same

//     }

//     public int getAge() {
//         return age;
//     }    
// }

// public class Main{
//     public static void main(String[] args) {
//         Human obj = new Human(11,"amal");


//         System.out.println(obj.getAge());
//     }
// }



// =========this and super ==============================


// class A{
//     public A(){
//         System.out.println("in A");
//     }
// }

// class B extends A{
//     public B(){
//         super();// calls constructir of A 
//         System.out.println("in B");
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//     B obj = new B();
//     // when this is created, both constructors are called
//     // if value is passed, the parameterised constructor in B will be called and then A

//   }
// } 

// every constructor contains a super method ,always there without mentioning
// super() means call the constructor of the super (i think parent) class

// if value is passed in super(), the parameterised constructor in A will be called


// every parent class in java extends an object class and thats where the super() class of the highest class goes to


// class A{
//     public A(){
//         System.out.println("in A");
//     }
// }

// class B extends A{
//     public B(){
//         super();// calls constructir of A 
//         System.out.println("in B");
//     }

//     public B(int n){
//         this();// calls default constructor
//         System.out.println("in B int");
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//     B obj = new B();
//   }
// } 

// the this() will execute the constructor of the same class


// naming conventions =============================

// camel casing
// class, interface - Calc,Runable
// variables - marks, show()
// constants - PIE, BRAND

// showMyMarks()
// MyData

// annonymous object


// class A{
//     public A(){
//         System.out.println("in A");
//     }
//     public void show(){
//         System.out.println("in show");
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         new A();// object creation, no reference variable
//         // these are called anonymous objects, dont have a name
//         // these cant be re used
//         new A().show();
//     }
// }