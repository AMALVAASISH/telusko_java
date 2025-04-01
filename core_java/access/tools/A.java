package core_java.access.tools;

class D {
    public void jkl(){
        A obj = new A();
        System.out.println(obj.marks);
        // marks can be accessed here
    }
}

public class A {
    protected int marks;
}

// protected variables work in the same package 
//and outside the package in sub classes 
// of the particular class

// keep classes public, only one allowed in a file bcoz of the assumption of only
// class in a file

// keep instance variables private

// keep methods public

// use protected , if u want to access in
// sub class of other packages

// avoid default


