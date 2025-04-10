package core_java.basics_2;

// public class Main {
//     public static void main(String[] args){

//         byte b = 127;
//         int a = 12;
//         b = (byte)(a);/// this is casting, explicit conversion, vice versa it is called implicit conversion


//         float f = 5.6f;
//         int num  = (int)f;// the number after the point is lost


//         byte b1 = 127;
//         int a1 = 256;
//         b1 = (byte)a1; /// in this case the int value is modulo(%) by the range of int (that is 127+ 127)


//         ///type promotion
//         byte c = 10;
//         byte c2 = 30;
//         int c3  = c*c2; // this is type promotion

//         // operator in java, relational and assignment operator

//         int amal = 1;
//         amal+= 2;

//         //System.out.println(amal);

//         //boolean operator

//         boolean answer = c == c2; // rpints false
//         System.out.println(answer);

//     }
// }

// in a developer env, there is a jdk and inside it there are jvm and jre , 
// in normal computers there will be no jdk, just the jvm and jre will be present , (jvm is inside the jre)
// thus java is wora(write once run anywhere)


//  logical operators

public class Main{
    public static void main(String[] args) {
        // int x = 7;
        // int y = 1;
        // boolean answer = (x>0 && y>0); // if using &&, there are three false and one true cases, for || there are
        // // three true and one false cases

        // System.out.println(answer);



        // conditional statements
        // int x = 10;
        // if(x>0 && x<100){
        //     System.out.println("done");
        // }else if(x<0){
        //     System.out.println("not done");
        // }


        // ternary operator - ? :
        // int n = 10;
        // int result = 0;
        // result = n%2==0 ? 10: 20;
        // System.out.println(result);


        // // switch statements
        // int n = 10;
        // switch (n) {
        //     case 1:
        //         break;
        //     case 2:
        //         break;
        //     case 10:
        //         System.out.println("switch works");
        //         break;
        //     default:
        //         break;
        // }


        // do{
        //     System.out.println("one time execution");
        // }while(false);
        
        // for(int i = 0;i<4;i++){
        //     System.out.println("for loop");
        // }

        // for(int j = 0;j<4;j++){
        //     for(int k=0;k<4;k++){
        //         // System.out.println(j+" "+k);
        //         System.out.println((j+8)); // here addition occurs due to parenthesis and not concatenation
        //     }
        // }
        int i = 1;
        for(;i<4;){} // this can be used as a case of while loop
    }
}

// till 2.32 hr mn done


