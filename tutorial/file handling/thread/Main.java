class MyData 
{
    int x=0;
    boolean flag=true;
  synchronized  public void set(int v)
    {
        while(flag!=true)
         try{
            wait();
        }
        catch(Exception e){}
        x=v;
        flag=false;
        notify();
    }
  synchronized  public int get()
    {  int d=0;
        while(flag!=false)
        try{
            wait();
        }
        catch(Exception e){}
        d=x;
        flag=true;
        notify();
        return d;
    }
    
}
class Prince extends Thread{
   
    MyData d;
    int count=0;
  public  Prince(MyData data)
    {
        d=data;
    }
    public void run()
    {
        while(true)
        {
            d.set(count);
            count++;
        }
    }
}
class gaurav extends Thread{
    int count=0;
    MyData d;
  public  gaurav(MyData data)
    {
        d=data;
    }
    public void run()
    {
        while(true)
        {
            System.out.println("gaurav "+d.get());
        
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	MyData d=new MyData();
	Prince p=new Prince(d);
	gaurav g=new gaurav(d);
	p.start();
	g.start();
	}
}