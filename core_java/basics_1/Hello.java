// do javac and java outside the current folder in which the java file is residing


package core_java.basics_1;

// import java.util.Scanner;

public class Hello {
   public static void main(String[] args){
    int num = 1;// literal

    int num2 = 0b101; // binary numbers are also supported

    int num3 = 1_00_00_00; // increases the readability

    char c = 'a';
    c++;
    System.out.println(c);
    System.out.println(c+num+num2+num3);// the char gets incremented 
   } 
}
