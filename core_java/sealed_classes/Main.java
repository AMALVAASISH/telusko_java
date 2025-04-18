package core_java.sealed_classes;

// sealed classes will only give permission to some
// classes to inherit the particular class
// and those classes need to sealed or non-sealed or final


// sealed class A extends Thread permits B,C {
//     // sealed class can extend,implement other classes also
// }

// final class B extends A{

// }

// non-sealed class C extends A{

// }

// class D extends C{
//     // non-sealed classes can be extended by other classes
// }

// sealed interface X permits Y{

// }

// non-sealed interface Y extends X{
//  // there is only sealed and non-sealed in interface
// }

// public class Main {
//     public static void main(String[] args) {
        
//     }
// }




// record classes

// functional or utility classes are used to perform some functions
// data carrier classes just hold the data


// class Alien{
//     private final int id;
//     private final String name;

//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
    
    
// }


record Alien(int id,String name){

}



// record Alien(int id,String name){

//     public Alien(){
//         this(0,"");
//     }

//     public Alien(int id,String name){
//         this.id = id;
//         this.name = name;
//     }
// }

// in this we define a parameterised and non-para constructor
// this creation of non-para constructor is not recommended


// record Alien(int id,String name){
//     public Alien{
//         if(id == 0)
//             throw new IllegalArgumentException("id cannot be zero");
//     }
// }

// this is a compact canonical constructor


public class Main{
    public static void main(String[] args) {
        
        Alien a1 = new Alien(1,"navin");
        System.out.println(a1);
        // prints value via toString i think

        Alien a2 = new Alien(1,"navin");

        System.out.println(a1.name());
        // get the name , since there is only getter and no setter


        System.out.println(a1.equals(a2));
        // this gives true after the generation of equals and hashcode
        // by using the source action


        // we have a class Alien for holding data
        // and it has so many methods
        // here comes a record class
        ///in this behind the scene , there are all the methods
        /// which have all the methods defined in the Alien class
        
        // Alien a3 = new Alien();
        // for this , check the commented record ALien


        // all the variables in record is final and private
        // in this data cannnot be changed

        // these record is a class itself bts
        // and cannot extend other classes
        // but it can implement interface

        // static variables can be created inside the record class

        // instance variables cannot be created inside the record class, it can only be passed in the parameters


        // canonical constructor
        // if the constructor has the same parameters, as the record, then it is called so



    }
}



// yes completed till 13.13.10  hr mm ss of core java

