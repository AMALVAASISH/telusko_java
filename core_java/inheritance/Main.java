package core_java.inheritance;



public class Main {
    public static void main(String[] args){
        // AdvCalc obj = new AdvCalc();
        // int r1 = obj.add(1,2);
        // int r2 = obj.sub(2,1);

        // System.out.println(r1 + " " + r2);

        SciCalc obj = new SciCalc();
        obj.add(1,2);
    }
}

// multiple inheritance

// class A{

// }

// class B{

// }

// class C extends A,B{

// }

// multiple inheritance will not work in java (not present - interview qu)
// bcoz there is confusion if the same method is present on
// both the parent classes, which one to choose
// this is a ambiguity problem
