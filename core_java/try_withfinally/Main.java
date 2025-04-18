package core_java.try_withfinally;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // int i = 0;
        // int j = 0;

        // try{
        //     j = 18/i;
        //     System.out.println("Bye");
        // }catch(Exception e){
        //     System.out.println("something went wrong");
        // }finally{
        //     System.out.println("Bye");
        // }// should be executed if u get the exception or not

        // finally makes sense when u want to close a resource
        // eg: BufferedReader
        int num = 0;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            // can be compressed to a single line

            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally{
            br.close();
            // resource is closed here, eg: file, network
        }


        // there is another way also
        // try with resources

        try(BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))){
            // in this , the resource will be closed automatically
            
        }
    }   
}
