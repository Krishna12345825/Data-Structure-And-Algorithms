//Second approach to create thread implementing Runnable interface:-
// Creates a class that implements Runnable interface.
package lectures.multiThreading;

class Myclass implements Runnable {

    @Override
    public void run() {

        System.out.println("Krishna kumar");
        System.out.println("Body of the threads");
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {

        Myclass myclass = new Myclass();
        Thread thread = new Thread(myclass);
        thread.start();
    }
}
