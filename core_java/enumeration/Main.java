package core_java.enumeration;

// enum Status{// Status is also a class
//     Running,Failed,Pending,Success;
//     // named constants
//     // these are the objects
// }

// public class Main {
//     public static void main(String[] args) {
//         Status s = Status.Running;
//         System.out.println(s);
//         // different constants have different numbers
//         System.out.println(s.ordinal());
//         // gets the number, similar to index
        
//         Status[] ss = Status.values();
//         System.out.println(ss[1]);
//         // get the value

//         for(Status y: ss){
//             System.out.println(y+" "+y.ordinal());
//         }
//     }
// }

// enums are named constants


// enum with if else and switch

// enum Status{
//     Running,Failed,Pending,Success;

// }

// public class Main {
//     public static void main(String[] args) {
//         Status s = Status.Running;
//         if(s == Status.Running){
//             System.out.println("running");
//         }else if(s == Status.Failed){
//             System.out.println("failed");
//         }

//         switch(s){
//             case Failed:
//                 System.out.println("failed");
//                 break;
//             case Running:
//                 System.out.println("running");
//                 break;
//             default:
//                 System.out.println();
//                 break;
//         }

//     }
// }

// enums cannot be extended


enum Laptop{
    Macbook(2000),XPS(2200),Surface(1500),ThinkPad(1000);
    // these are objects 

    private int price;

    private Laptop(int price) {// created by source action
        this.price = price;
    }// this is a paramaterised contructor, 
    // if it is only present we have to pass value to the objects
    //it is called three times, since there are 3 objects with parameters
     

    private Laptop(){
        price  = 500;
    }
    // now objects can be created wihout passing in values
    // and this price value will be in them


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap.getPrice());
        // this is specific to the macbook object only

        for(Laptop lap1: Laptop.values()){
            System.out.println(lap1+ ""+ lap.getPrice());
        }
    }
}