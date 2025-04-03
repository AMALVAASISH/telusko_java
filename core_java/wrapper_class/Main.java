package core_java.wrapper_class;

public class Main {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = new Integer(num);
        // taking primitive value and storing in object

        //this is called boxing

        Integer num2 = num;
        // here also boxing is happening automatically
        // so called autoboxing

        

        int num3 = num2;// different methods can be used, like intValue()
        // here unboxing is done, from object  to primitive type
        // auto unboxing
        System.out.println(num3);


        String str = "12";
        int num4 = Integer.parseInt(str);
        System.out.println(num4*2);
    }


}

// for every primitive type , we are going to have a class for it
// it extends the object class

// int -> Integer
// char -> Character
// double -> Double


