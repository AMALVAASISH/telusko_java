package core_java.static_keyword;


// class Mobile{
//     String brand;
//     int price;
//     static String name;// static makes the variable common for all the objects
//     // these are called with class name, calling object should be avoided
//     // static means we are making something as a class member, not object member


//     public void show(){
//         System.out.println(brand+" : "+price+" : "+name);
//     }
// }

// public class Main {
//     // 4.56 hr mn
//     public static void main(String[] args) {
//         Mobile obj = new Mobile();
//         obj.brand = "iphone";
//         obj.price = 1500;
//         Mobile.name = "smartphone";

//         Mobile obj2 = new Mobile();
//         obj2.brand = "SAMSUNG";
//         obj2.price = 1700;
//         Mobile.name = "smartphone";

//         obj.show();
//         obj2.show();
//     }
// }

// // 5.02 hr mn



// class Mobile{
//     String brand;
//     int price;
//     static String name;

//     static{
//         name = "Phone"; // this book will be initialised only one time, (called once only)
//     }

//     public Mobile(){
//         brand = "";
//         price = 200;
//     }

// }

// public class Main {
//     // 4.56 hr mn
//     public static void main(String[] args) throws ClassNotFoundException {
//         Mobile obj = new Mobile();
//         obj.brand = "iphone";
//         obj.price = 1500;
//         Mobile.name = "smartphone";

//         Class.forName("Mobile");// this is for loading the class without creating an object
         

//     }
// }

// when objects are created, the class loads and then the objects are instantiated

// static methods


class Mobile{
    String brand;
    int price;
    static String name;

    public static void show(){
        System.out.println(name);// only static variables can be accessed in this
        // the instance variables cannot be called bcoz we dont know which object they point to
    }
    
    public static void show1(Mobile obj){
        System.out.println(name + ""+ obj.brand+ "" + obj.price);// with obj ref, non static var can be used
        // in static methods
    } 

}

public class Main {
    // 4.56 hr mn
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile obj = new Mobile();
        obj.brand = "iphone";
        obj.price = 1500;
        Mobile.name = "smartphone";

        Mobile.show();

        Mobile.show1(obj);
        // static methods can be called with classname

    }
}

