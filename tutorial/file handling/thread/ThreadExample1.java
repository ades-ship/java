// Implementing runnable interface by extending Thread class  
class ThreadExample2 extends Thread {
    public void run() {
        System.out.println("thread 2 is running");
    }
}
public class ThreadExample1 extends Thread {
    // run() method to perform action for thread.
    public void run() {
        int a = 10;
        int b = 12;
        int result = a + b;
        System.out.println("Thread1 started running..");
        //System.out.println("Sum of two numbers is: " + result);
    }

    public static void main(String args[]) {
        // Creating instance of the class extend Thread class
        // calling start method to execute the run() method of the Thread class
        int i=0;
        while(i++<10) {
        ThreadExample1 t2=new ThreadExample1();
        ThreadExample2 t1 = new ThreadExample2();

            t1.start();
            t2.start();
        }
        }
}