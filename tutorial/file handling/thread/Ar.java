import java.util.*;
class table
{
    synchronized  void printtable(int n)
    {
        for(int i=0;i<=5;i++)
        {
          System.out.println(i*n);
        }
    }
}
class A extends Thread{
    table t;
     A(table t)
     {
        this.t=t;
     }
    public void run()
    {
        t.printtable(10);
    }
}
class B extends Thread{
    table t;
    B(table t)
    {
       this.t=t;
    }
    public void run()
    {
       t.printtable(10);
    }
}
public class Ar {
    public static void main(String []args)
    {
        table t=new table();
          A obj=new A(t);
         
          B obj1 =new B(t);
          obj.setName("hii");

          obj.start();
          obj1.start();
    }
}