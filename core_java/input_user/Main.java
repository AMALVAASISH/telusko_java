package core_java.input_user;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println();// this println method belongs to which class?
        // // it belongs to printStream class and callled via out object of printStream via the system class
        // try{
        //     int num = System.in.read();// 
        //     // it gives ascii value 
        //     System.out.println(num - 48);// ascii for zero is 48

        //     // checked exception, so we have to handle it

        // }catch(Exception e){
        //     System.out.println(e);
        // }


        // using BufferedReader
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // try{
        // int num =Integer.parseInt(bf.readLine());

        // bf.close();
        // // since bufferedReader is a resource,it should be closed

        // }catch(Exception e){
        //     System.out.println(e);
        // }

        // Scanner was introduced after BufferedReader

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    }   
}




// 10.05 hr mm ss
