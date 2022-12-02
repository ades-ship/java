import java.util.*;
import bank;
class pen {
    String color,type;
     pen() {
         // non parameterised constructor;
     }
     pen(String color, String type) {
        // parameterised constructor;
     }
    void write() {
        System.out.println("writing");
       
    }
    void printcolor() {
        System.out.println(this.color);
    }
}
public class oops {

    public static void main(String []args) {
         pen pen1=new pen();
         pen1.color="red";
         pen1.type="ball point";
         pen pen2=new pen();
         pen2.color="blue";
         pen2.type="gel point";
         pen1.printcolor();
         pen2.printcolor();

    }
}

class Student {
    String name;
    int age;  
     void print(String name, int age) {
         System.out.println(this.name);
         System.out.println(this.age);

     }

     public static void main(String []k) {
         Student s1=new Student();
         s1.name="adesh";
         s1.age=20;
         s1.print(s1.name,s1.age);
         bank.Account obj=new bank.Account();
         obj.name="customer1";
     }

}