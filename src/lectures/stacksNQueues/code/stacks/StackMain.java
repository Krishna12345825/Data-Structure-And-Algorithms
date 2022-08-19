package lectures.stacksNQueues.code.stacks;

public class StackMain {
    public static void main(String[] args) throws StackException {
        Q1Stacks stacks = new Q1Stacks(5);
        stacks.push(34);
        stacks.push(35);
        stacks.push(36);
        stacks.push(37);
        stacks.push(38);
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        // System.out.println(stacks.pop());


    }
}
