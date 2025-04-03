package core_java.abstract_keyword;

// abstract class Car{
//     public abstract void drive();// method declaration


//     public void playMusic(){
//         System.out.println("play music");
//     }
// }

// class WagonR extends Car{
//     public void drive(){
//         System.out.println("drive ");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Car obj = new Car();// abstract class object cannot be created

//         Car obj = new WagonR();
//         obj.drive();
//         obj.playMusic(); 
//     }
// }

// abstract methods can be present abstract class only,
// and whichever class extends the abstract class, the method inside it should be defined

// in case, where the class inheriting abstract class doesnt 
// define the abstract method, this particular class should also
// be made abstract

// issue is that obj of abstract class cannot be created
// so another class is created



abstract class Car{
    public abstract void drive();// method declaration
    public abstract void fly();

    public void playMusic(){
        System.out.println("play music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("drive ");
    }
}


class UpdatedWagonR extends WagonR{ // concrete class
    public void fly(){
        System.out.println("fly");
    }
}
public class Main {
    public static void main(String[] args) {
        // Car obj = new Car();// abstract class object cannot be created

        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic(); 
    }
}


// object of concrete class can be created
