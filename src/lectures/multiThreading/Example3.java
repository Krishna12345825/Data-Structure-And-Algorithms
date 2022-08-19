package lectures.multiThreading;
class  MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("My thread 1 task");
    }
}
class MyThread3 extends Thread
{
    public void run()
    {
        System.out.println("My thread tsk 2 ");
    }
}
class MyThread4 extends Thread
{
    public void run()
    {
        System.out.println("My Thread task 3");
    }
}
public class Example3 {
    public static void main(String[] args) {
        MyThread2 thread2= new MyThread2();
        MyThread3 myThread3 =new MyThread3();
        MyThread4 myThread4 = new MyThread4();
        thread2.start();
        myThread3.start();
        myThread4.start();
    }
}
