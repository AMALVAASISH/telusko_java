package core_java.annotations_explin;

class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("inj A");
    }
}

class B extends A{
    
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("inj B");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();

    }
}

// annotations are just metadata
// supplied to compiler or runtime
