


class RattaiahSirThread extends Thread
{
    public void run()
    {
        System.out.println("Enter into thread Rattaiah");
        System.out.println("thread Rattaiah is started");
        for (int i=0;i<10 ;i++ )
        {
            System.out.println("Rattaiah");
        }
        System.out.println("thread Rattaiah is ended");
    }
};
class NagoorSirThread extends Thread
{
    public void run()
    {
        System.out.println("Enter into thread Nagoor");
        System.out.println("thread Nagoor is started");
        for (int i=0;i<10 ;i++ )
        {
            System.out.println("Nagoor");
        }
        System.out.println("thread Nagoor is ended");
    }
};
class RamiReddySirThread extends Thread
{
    public void run()
    {
        System.out.println("Enter into thread Ramereddy");
        System.out.println("thread RamiReddy is started");
        for (int i=0;i<10 ;i++ )
        {
            System.out.println("RamiReddy");
        }
        System.out.println("thread RamiReeddy is ended");
    }
};

class Test {
    public static void main(String[] args) {
        RattaiahSirThread thread1=new RattaiahSirThread();
        NagoorSirThread thread2=new NagoorSirThread();
        RamiReddySirThread thread3=new RamiReddySirThread();
        thread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread1.getPriority());
        thread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(thread2.getPriority());
        thread3.setPriority(thread2.getPriority()+1);
        System.out.println(thread3.getPriority());
        System.out.println("starting of Rattaiah Thread");
        thread1.start();
        System.out.println("starting of Nagoor Thread");
        thread2.start();
        System.out.println("starting of RamiReddy Thread");
        thread3.start();
    }
}

