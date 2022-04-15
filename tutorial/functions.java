import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class functions {
   public static void printName(String name) {
       System.out.println(name);
       return;
   }
 
   public static int product(int number1, int number2) {
    //System.out.println(number1*number2);
    return number1*number2;
}

   public static void sum(int number1, int number2) {
    System.out.println(number1+number2);
    return;
}

public static int factorial(int number1) {
    if(number1>=0)
    {
        if(number1==0  || number1==1)
        return 1;
    //System.out.println(number1+number2);
       return number1 * factorial(number1-1);
    }
    else
     return -1;
}


    public static void main(String []k) {
        Scanner sc= new Scanner(System.in);
        //String name=sc.next();
        //printName(name);   // call kiya function  ko
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
         sum(a,b);
         System.out.println("product is "+product(a,b));
         System.out.println(+factorial(a));
         return;
    }
}
