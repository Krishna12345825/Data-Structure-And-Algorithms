package assignments.saurabhSukhla.recursion;
//5. Write a recursive function to print first N even natural numbers

public class Q5PrintFirstNEvenNumber {
    public static void main(String[] args) {
        int n = 10;
        even(n);
    }

    public static void even(int n) {
        if (n == 0)
            return;
        even(n - 1);
        System.out.print(" " + (2 * n));
    }
}
