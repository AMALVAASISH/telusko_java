package core_java.access;

import core_java.access.tools.Calc;
import core_java.access.tools.A;



// public class Main {
//     public static void main(String[] args) {
//         Calc obj = new Calc();
//         System.out.println(obj.marks);
//     }
// }
 



// no access modifier is needed for variables
// if they are in the same package

// otherwise public is put


// when no access modifier is specified, there is a access modifier
// used known as default (private protected)


// below points are repeated above earlier
// // no access modifier is needed for variables
// // if they are in the same package


class C extends A{
    public void abc() {
        System.out.println(marks);
    }
    // accessible here 

}

public class Main {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.marks);

        A obj1  = new A();
        // System.out.println(obj1.marks);// marks cannot be accessed
    }
}


// protected variables work in the same package(where the variable is present) 
// and outside the package in a sub classes 
// of the particular class