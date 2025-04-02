// package core_java.polymorphism;

// public class Main {
    
// }

// // 7.04.49 hr mn ss


// // lets go bro

// // polymorphism means many behaviour
// // types - compile time(early binding) and runtime(late binding) 

// // if behaviour is defined at compile time,it is compile time polymorphism
// // overloading is an example of compile time

// //over riding is an example of runtime


// what is dynamic method dispatch

package core_java.polymorphism;

class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C");
    }
}

class D{

}

public class Main {
    public static void main(String[] args) {
        A obj = new B();// we are refering A here, type as parent
        // object is of child
        obj.show(); // it gives the show() in B
        // bcoz it depends on the object and not the reference

        obj = new C();
        obj.show();
        // it will give show from C
        // show() of which class to call , is decided at runtime,
        //thats why
        // this is runtime polymorphism

        // dynamic method dispatch, the above

        obj = new D();
        // not possible there is no inheritance and a parent class
        //is being referenced
        

    }
}
