import java.util.*;
public class array {
     int id;
     String name;
    //p4
     array() {
       System.out.println("constructor call");
    }
    array(int i, String st) {
        id=i;
        name=st;
    }
    void display() {
        System.out.println("name is "+name+" id is "+id);
    }
     
    public static void main(String []k) {
        // program 1
       /* Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        for(int i=0 ; i<arr.length ; i++)
         arr[i]=sc.nextInt();
         */

         // program 2
        /* String s=new String("welcome");
         char ch[]={'a','d','e','s','h'};
         String s1=new String(ch);
         System.out.println(s);
        System.out.println(ch);
          System.out.println(s1);
          */
          // p3
          /*
          StringBuffer obj=new StringBuffer("hello");
          obj.append("adesh");
          System.out.println(obj);
          */
       // p4
       /*
         array obj=new array();
         array obj1=new array(12,"adesh");
         array obj2=new array(14,"nitish");

         obj1.display();
         obj2.display();
         array obj3=new array();
        */


    }
}
