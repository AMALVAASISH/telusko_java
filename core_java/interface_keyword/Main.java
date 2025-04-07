package core_java.interface_keyword;

//8.21.19 hr mn ss

// interface Computer{
//     public abstract void code();
// }

class Computer{
    public void code(){}
}

class Laptop extends Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("code,compile,run: faster");
    }
}

class Developer{
    // public void devApp(Laptop lap){
    //     lap.code();
    // }
    public void devApp(Computer lap){
        lap.code();
    }
}

public class Main {
    public static void main(String[] args) {
        // this is for code without extending computer
        // Laptop lap = new Laptop();
        // Desktop desk = new Desktop();

        // Developer navin = new Developer();
        // navin.devApp(lap);
        // navin.devApp(desk);// writing desktop here is an issue
        // // no flexibility
        // // here developer is dependent on laptop

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer navin = new Developer();
        navin.devApp(desk);
    }
}
