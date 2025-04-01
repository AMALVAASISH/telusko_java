package core_java.inheritance;

public class AdvCalc extends Calc {
    public int multi(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}

// here inheritance takes place,
// all the features of Calc are available in this also

// this is single level inheritance


// also for this to work with inheritance
// it can work with just Calc.class also
// no need for Calc.java
