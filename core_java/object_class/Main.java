package core_java.object_class;

// every class in java extends the object class,
// without specifing

class Laptop{
    int price;
    String model;

    public String toString(){
        return "Hey";
    }

    public boolean equals(Laptop that){
        // if(this.model.equals(that.model) && this.price == that.price){
        //     return true;
        // }else 
        // return false;

        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo";
        obj.price = 1000;

        System.out.println(obj);
        //core_java.object_class.Laptop@2f92e0f4

        // everytime when we try to print the obj, it will
        // call the toString() method

        System.out.println(obj.toString());// same as just obj

        // hashcode tries to create a fixed string of the all data available

        // if toString() is in the class, it will be called rather from the object class
        System.out.println(obj);
        // will call the toString() in the class not the super class

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo";
        obj2.price = 1000;
        System.out.println(obj2.equals(obj));
        // gave false, when method in class

        // compares by the hexadecimal values, comes from the object class




    } 
}
