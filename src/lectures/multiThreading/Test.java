package lectures.multiThreading;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Thread t = Thread.currentThread();
        System.out.println("current thread information is "+ t); //Thread[main,5,main]
        System.out.println("current thread priority is "+t.getPriority());  //5
        System.out.println("current thread name is "+ t.getName());
        System.out.println("Hey Krishna");
    }
}


//    The main important application areas of the multithreading are
//        1. Developing video games
//        2. Implementing multimedia graphics.
//        3. Developing animations

//    There are two different ways to create a thread isavilable
//1) Create class that extending standered java.lang.Thread Class
//        2) Create class that Implementing java.lang.Runnable interface