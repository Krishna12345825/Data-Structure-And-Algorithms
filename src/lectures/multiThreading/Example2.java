package lectures.multiThreading;
class MyThread1 extends  Thread
{
    public void start()
    {
        System.out.println("Override start method");
    }
}

public class Example2 {
    public static void main(String[] args) {
        MyThread1  t = new MyThread1();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
    }
}
