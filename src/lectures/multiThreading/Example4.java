package lectures.multiThreading;

class MyThreadd extends Thread
{

}
public class Example4 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThreadd myThreadd= new MyThreadd();
        System.out.println(myThreadd.getName());
        Thread.currentThread().setName("Krishna kumar");
        System.out.println(Thread.currentThread().getName());
    }
}
