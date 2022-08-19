package assignments.saurabhSukhla.recursion;
//6. Write a recursive function to print first N even natural numbers in reverse order

public class Q6PrintFirstNEvenReverseNumber {
    public static void main(String[] args) {
        int n = 10;
        reverse(n);
    }

    public static void reverse(int n) {
        if (n == 0)
            return;
        System.out.print(" " + 2 * n);
        reverse(n - 1);
    }
}
