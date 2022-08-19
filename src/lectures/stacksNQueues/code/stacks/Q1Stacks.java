package lectures.stacksNQueues.code.stacks;

public class Q1Stacks {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public Q1Stacks() {
        this(DEFAULT_SIZE);
    }

    public Q1Stacks(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full !!");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    boolean isFull() {
        return ptr == data.length - 1; //ptr is at last index
    }

    private boolean isEmpty() {
        return ptr == -1; //ptr is at last index
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack !!");
        }
//        return removed=data[ptr];
//        ptr--;
//        return removed;

        return data[ptr--];
    }


    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack !!");
        }
        return data[ptr];
    }


}
