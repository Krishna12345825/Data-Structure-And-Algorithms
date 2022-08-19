//First approach to create thread extending Thread class:-
//In this approach take one user defined class class that is extending Thread class .

package lectures.multiThreading;

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Krishna kumar yadav");
        System.out.println("body of the thread");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread myThread= new MyThread();
        myThread.start();
    }
}
