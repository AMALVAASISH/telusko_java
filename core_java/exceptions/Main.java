package core_java.exceptions;

// public class Main {
//     public static void main(String[] args) {
//         int i = 0;// normal statement

//         // int j = 18/i;
//         // critical statement
//         // exception handling for this

//         int j =0;
//         try{
//             j = 18/i;
//         }
//         catch(Exception e){
//             System.out.println("something went wrong "+e);
//         }

//         int[] nums = new int[7];

//         try{
//             int k = nums[10];
//         }catch(ArithmeticException ae){

//         }catch(ArrayIndexOutOfBoundsException ee){

//         }catch(Exception exe){

//         }// keep the parent class at the bottom

//     }
// }


// exceptions

///errors
/// compile time error
/// runtime error : execution stops
///  -> exception handling
/// 
/// logical error
/// 
/// 
// all runtime exception are called 
// unchecked exceptions
// means its ur choice , if u want to handle it or not



// throw keyword


class NavinException extends Exception{// extends Runtimeexception
    public NavinException(String string){// constructor, for receiving the parameters
        super(string);
        // to tell teh exception class that we are accepting a string
        // and it prints ne correctly

    }
}

public class Main {
    public static void main(String[] args) {
        int i = 20;// check with values 0 and 20
        int j =0;

        try{
            j = 18/i;
            if(j == 0)
                throw new ArithmeticException();
                // any message can also be passed in (), " "
            



            if(j == 1)
                throw new NavinException("somethign went wrong");
                // new exception can be created , by creating a class
                // catch should also be there

        }catch(NavinException ne){

            System.out.println("thats my own error handling exceptioon"+ne);
        }catch(ArithmeticException ae){
            j = 18/1;// exception handling 
            System.out.println("thats the default output"+a);
        }catch(Exception exe){

        }

        System.out.println(j);

    }
}

// 9.53 started
// throws

