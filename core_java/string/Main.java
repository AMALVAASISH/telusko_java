package core_java.string;

public class Main {
    public static void main(String[] args) {
        // String is actually a class, not a primitive datatype

        // String name = "amal";

        // String name = new String("amal");// 105 address
        // // this creats a stack, which contains a reference variable pointing to memory adress in the heap, and t
        // // he value of string resides in the heap

        // System.out.println(name.hashCode());

        // System.out.println(name.charAt(1));// prints character at index specified


        // String name1 = "amal"; // behind the scene also the object creation is happening

        // name1 = name1+"v aasish";
        // System.out.println(name1);// the "v aasish" is NOT getting added to name1 variable, X "amal v aasish" (check the below comment)

        // Java String objects are immutable, meaning that once a string is created, it cannot be changed. 
        // But the variable name1 is just a reference — it can be updated to point to a new string object.



        // String s1 = "navin";
        // String s2 = "navin";
        // these two are not different, they are the same , in total, there is only one object

        // System.out.println(s1 == s2);// true, value for both variables wiill be the same
        // value for both addresses are same

        //string constant pool- area inside the heap, where strings are stored as constant
        //it cannot be changed, and the itss address , will be in the stack for the corresponding ref variable


        // when assigning string value, it checks if it is already there is the string constant pool
        // if present, gives the same address used by the other ref var, no new object is created

        // s1 = s1 + "hello";// when this is done, the new object is created , containing this updated value in 
        // string constant pool
        // and the address in the ref variable in the stack is changed
        // old created object is removed by garbage collector

        // Mutable and immutable string

        // string are immutable by default

        // to create mutable string, string buffer and string builder can be used

        


        // string buffer

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//default 16 characters


        StringBuffer sb1 = new StringBuffer("amal");// capacity changes and it is mutable, 20 characters
        // to reduce reloaction of string, it gives buffer of 16 characters
        System.out.println(sb1.length());

        sb1.append("v aasish");

        sb1.deleteCharAt(0);// deletes a char at a specified position

        sb1.insert(1, "java");// insert at a specified location

        sb1.setLength(30);// to set the length of the string buffer
        sb1.ensureCapacity(21);// to give minimum capacity

        System.out.println(sb1);
        // 4.51 hr mn
        // String str = sb1.toString();// to convert from stringbuffer to string


        // string buffer is thread safe and string builder is not, thats the only difference betweem them


    }   
}
