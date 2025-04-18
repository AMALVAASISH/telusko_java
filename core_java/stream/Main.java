package core_java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(4,5,7,2);

//         // int sum = 0;
//         // for(int n:nums){
//         //     if(n%2 == 0){
//         //         n = n*2;
//         //         sum = sum + n;
//         //     }
//         // }

//         // System.out.println(sum);

//         nums.forEach(n -> System.out.println(n));
//         // n is the individual value inside
//         // here, this is the derived form from the 
//         // lambda expression

//         // this is the behind the scenes working of forEach
//         Consumer<Integer> con = new Consumer<Integer>() {
//             public void accept(Integer n){
//                 System.out.println(n);
//             }
//         };
//         // lambda expression can be used here
//         // can be derived into the above expression

//         nums.forEach(con);
//     }
// }

// =+++++++++++++++++++++++++++++++++++++++++++++++++++++

// =+++++++++++++++++++++++++++++++++++++++++++++++++++++

// =+++++++++++++++++++++++++++++++++++++++++++++++++++++

// public class Main{
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(4,5,7,2);

//         Stream<Integer> s1 = nums.stream();
//         // s1 will contain all the values

//         // changes in s1 will not be reflected in the nums
//         // once stream is used, we cant re use it

//         // s1.forEach(n -> System.out.println());
//         // this statement cannot be used again
//         // its like a river stream,  oncec touched water cannot be
//         // touched again


//         Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
//         // s2 will have only even numbers

//         Stream<Integer> s3 = s2.map(n -> n*2);

//         int result = s3.reduce(0, (c,e) -> c+e);

//         // stream makes your work easy, by using these methods

//         // these can be combined together

//         // int result = nums.stream()
//                     //     .filter(n -> n%2 == 0)
//                     //     .map(n -> n+2)
//                     //     .reduce(0,(c,e) -> c+e);
//     }   
// }



// =+++++++++++++++++++++++++++++++++++++++++++++++++++++

// =+++++++++++++++++++++++++++++++++++++++++++++++++++++

// =+++++++++++++++++++++++++++++++++++++++++++++++++++++

public class Main{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,3,2,10);
        
        Predicate<Integer> p = new Predicate<Integer>() {

            public boolean test(Integer n) {
                if(n%2 == 0)
                    return true;
                else
                    return false;
            }
            
        };
        // this can be reduced to lambda expression 
        // Predicate<Integer> p = n -> n%2 == 0
        // this will be the expression
        // it can be passed in filter directly
        // and thats how filter condition is derived

        Function<Integer,Integer> fun = new Function<Integer,Integer>() {
            public Integer apply(Integer n){
                return n+2;            }
        };

        int result = nums.stream()
                        .filter(p)
                        .map(fun)
                        .reduce(0,(c,e) -> c+e);

        Stream<Integer> sortedValues = nums.stream()
                        .filter(n -> n%2 == 0)
                        .sorted();
        /// this way we can get sorted values using stream
        sortedValues.forEach(n -> System.out.println(n));


        Stream<Integer> sortedValues1 = nums.parallelStream()
                        .filter(n -> n%2 == 0)
                        .sorted();
        // this will create multiple threads , for it to run faster
        // in case of filter it is ok, dont use it with sorting

    }
}