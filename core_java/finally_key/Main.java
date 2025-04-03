package core_java.finally_key;

// final can be used with variable,method and class

// public class Main {
//     public static void main(String[] args) {
//         final int num = 9;
//         // num = 3;// this cannot be done bcoz the variable is 
//         // a const via final keyword
//         System.out.println(num);
//     }
// }


final class Calc{
    public final void show(){
        System.out.println("in calc show");
    }

    public void add(int a , int b){
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc{
    // if final is used with class, it cannot be inherited
    
}

class CalcCalc{
    public final void show(){

    }
}

class SciCalc extends CalcCalc{
    public void show(){
        // the method over riding cannot take place
        // bcoz the method is given final

    }
}

public class Main{
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(1, 2);
    }
}

