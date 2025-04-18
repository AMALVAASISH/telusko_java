package core_java.collections;

import java.util.ArrayList;
import java.util.Arrays;

// collection api - concept
// collection - interface
// collections - class

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Collection nums = new ArrayList();
        // nums.add(2);
        // nums.add("nums");
        // here Collection is an object type
        // so we can add anything

        // Collection<Integer> nums = new ArrayList<>();
        // // this will specify the type as integer
        // nums.add(1);
        // System.out.println(nums);

        // this collection interface doesnt support get method
        // so we can only do insert
        // so if we change from Collection to List interface, it has
        // get methods, we can do index based getting of data

        // List<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(2);

        // int n = nums.get(0);
        // System.out.println(n);

        // there will be duplicates in list

        // set doesnot contain duplicates
        // its unsorted, unordered --- imp

        // Set<Integer> nums= new HashSet<Integer>();
        // nums.add(1);
        // nums.add(1);// this will not get added

        // for(int n: nums){
        //     System.out.print(n+" ");
        // }
        // there is no get method in Set

        // for sorted set, use treeset

        // Set<Integer> nums = new TreeSet<Integer>();
        // nums.add(1);
        // nums.add(11);
        // nums.add(2);
        // nums.add(10);

        // for(int n: nums){
        //     System.out.println(n);
        // }
        // // this treeest implements navigableset and
        // // it implements sortedset
         
        // // collection interface is implementing iterable()
        // // it gives iterator()

        // Iterator<Integer> values = nums.iterator();
        
        // while(values.hasNext()){
        //     System.out.println(values.next());
        // }


        Map<String,Integer> students = new HashMap<>();
        // map is the interface and Hashmap is the class 
        students.put("amal", 78);
        students.put("kiran", 88);
        // this is also unordered, unsorted

        students.get("kiran");
        // in this , the keys are unique and can be changed
        for(String name: students.keySet()){
            System.out.println(name+ " "+ students.get(name));
        }   

        // hashmap and hashtable work almost the same
        // its synchronised
        // so use hashtable when using multiple threads


    }   
}


// 11.45.44 hr mm ss