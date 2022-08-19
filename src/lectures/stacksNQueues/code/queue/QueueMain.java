package lectures.stacksNQueues.code.queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        Q1Queue queue = new Q1Queue(5);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.display();

        System.out.println(queue.remove());
        queue.display();
    }
}
