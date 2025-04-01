package core_java.arrays;

// public class Main {
//     public static void main(String[] args) {
//         // int[] arr = {1,2,3,4};
//         // int[] array = new int[4]; // to create a new array without values, just giving size, all values are zero

//         // arr[2] = 0;// changing values

//         // int[][] nums = {{1,2,3},{4,5,6}};// multidimensional array
//         // int[][] nums2 = new int[4][2];//{{1,2},{1,1},{1,1},{1,1}}
//         // for(int i = 0;i<4;i++){
//         //     for(int j = 0;j<2;j++){
//         //         nums2[i][j] = (int)(Math.random() * 100);
//         //         System.out.print(nums2[i][j]+ " ");
//         //     }
//         //     System.out.println();
//         // }


//         // // advanced for loop

//         // for(int[] n: nums2){
//         //     for(int n1: n){
//         //         System.out.println(n1);
//         //     }
//         // }

//         // jagged array

//         // int[][] jaggedarray = new int[4][];
//         // jaggedarray[0] = new int[2]; // SPECIFY THE INTERNAL ARRAY
//         // jaggedarray[1] = new int[3];
//         // jaggedarray[2] = new int[4];
//         // jaggedarray[3] = new int[1];

//         // for(int i = 0;i<jaggedarray.length;i++){
//         //     for(int j=0;j<jaggedarray[i].length;j++){
//         //         jaggedarray[i][j] = (int)(Math.random()*10);
//         //         System.out.print(jaggedarray[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }


//         // new is used to create array, so it is an object, resides in heap memory

//         // continuous memory is used in heap, hard to change the size of the array
//         //linear traversal, time consumptipon


//     }
// }


// need for an array
// to avoid using multiples variables





class Student{
    int rollno;
    String name;
    int marks;
}

public class Main{
    public static void main(String[] args){
        // Student s1 = new Student();
        // s1.rollno = 1;
        // s1.name = "amal";
        // s1.marks = 87;

        // Student s2 = new Student();
        // s2.rollno = 2;
        // s2.name = "kiran";
        // s2.marks = 88;

        // Student s3 = new Student();
        // s3.rollno = 1;
        // s3.name = "john";
        // s3.marks = 77;

        // Student[] students = new Student[3];// array of students,in this objects are not created
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // System.out.println(s1);// gives an address not the details inside the array

        // for(int i = 0;i<students.length;i++){
        //     System.out.println(students[i].name+" : "+ students[i].marks);
        // }

        // for(Student stud: students){
        //     System.out.println(stud.name);
        // }

        // int[] nums = {1,2,4,5};
        // for(int n: nums){
        //     // this is a forEach loop, it gives one value at a time, also called enhanced forloop
        // }
    }

}
