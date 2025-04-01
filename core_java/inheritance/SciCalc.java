package core_java.inheritance;

public class SciCalc extends AdvCalc {
    public double power(int a, int b){
        return Math.pow(a, b);
    }
}


// this is multi level inheritance, bcoz it takes 
// methods from Calc class also via AdvCAlc

