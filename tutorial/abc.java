import java.util.*;
public class abc {
    static int a,b;
    public static void disp() {
        System.out.println("hi nitish");
    }
    // static methods only uses static members inside it;
  public static void main(String []k) {
      System.out.println("hi adesh");
     abc obj=new abc();
     obj.disp();
     a=10;
     System.out.println(+a);
  }
  //we can overload main method with different parameter;
  public static void main() {
      
  }
}

 class demo {
   public static void main(String []args) {
   System.out.println("hi gaurav");
   }
}