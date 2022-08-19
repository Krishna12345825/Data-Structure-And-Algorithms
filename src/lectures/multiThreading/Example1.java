package lectures.multiThreading;

class MyThred extends Thread
{

}
public class Example1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
    }
}
