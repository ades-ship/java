class 
class MyThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println("i am thread1");
            i++;
        }
    }
}

    class MyThreadRunnable2 implements Runnable {
        public void run() {
            int i = 0;
            while (i < 20) {
                System.out.println("i am thread2");
                i++;
            }
        }

        public static void main(String[] k) {

        }
    }

public class runnable {
    public static void main(String k[]) {
       MyThreadRunnable1 bullet1=new MyThreadRunnable1();
       MyThreadRunnable2 bullet2=new MyThreadRunnable2();
       Thread gun1=new Thread(bullet1);
       Thread gun2=new Thread(bullet2);
       gun1.start();
       gun2.start();

    }
}
