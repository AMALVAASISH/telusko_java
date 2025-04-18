package core_java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> nums = new ArrayList<>();
//         nums.add(1);
//         nums.add(3);
//         nums.add(2);
//         nums.add(4);

//         Collections.sort(nums);
//         // sorting using collections class

//         // for using our logic in sorting , we use comparator

//         Comparator<Integer> cn = new Comparator<Integer>()
//         {
//             public int compare(Integer a, Integer b)
//             // Integer , since collections work with the 
//             // wrapper classes

//             {
//                 if(a%10 > b%10){
//                     return 1;// if true, 1 causes it to swap
//                 }else return -1;// no swap
//             }
//         };

//         Collections.sort(nums, cn);
        
//     }
// }

// comparator is an interface, where
// u can specify your own logic for sorting



// ===


class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    
}

public class Main {
    public static void main(String[] args) {

        Comparator<Student> cn = new Comparator<Student>()
        {
            public int compare(Student a, Student b)
            {
                if(a.age > b.age){
                    return 1;
                }else return -1;
            }
        };

        List<Student> nums = new ArrayList<>();
        nums.add(new Student(21, "navin"));
        nums.add(new Student(22, "amal"));
        
        // 11.56.02
        // sort based on age
        
        Collections.sort(nums, cn);

        // this method can work without cn, by the
        // class Student implementing Comparable<Student>
        //and having a method
        // public int compareTo(Student that){
        // if(this.age > that.age){ // cpmparing current and other student
        // return 1;
        //else
        //return 0;
        //

        // since the cpmarator is a functional interface, we can
        // implement lambda expressions in that
    }
}
