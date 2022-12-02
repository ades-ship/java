import java.util.*;
abstract class Animal {
    abstract void walk();
    Animal() {
        System.out.println("creating animal");
    }
}

class chicken extends Animal {
   void walk() {
     System.out.println("walk with 2");
   }
}

class Horse extends Animal {
    void walk() {
     System.out.println("walk with 4");
    }

    Horse() {
        System.out.println("horse class");
    }
    public static void main(String []k) {
        Horse horse=new Horse();
        horse.walk();
        chicken c=new chicken();
        c.walk();
        //Animal animal =new Animal();// abstract animal class object cant be instantiated;
        //animal.walk();

    }
}
