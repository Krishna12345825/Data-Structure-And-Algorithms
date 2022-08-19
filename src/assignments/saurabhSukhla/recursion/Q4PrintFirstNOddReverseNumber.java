package assignments.saurabhSukhla.recursion;
//4. Write a recursive function to print first N odd natural numbers in reverse order

public class Q4PrintFirstNOddReverseNumber {
    public static void main(String[] args) {
        int n = 10;
        odd(n);
    }

    public static void odd(int n) {
        if (n == 0)
            return;
        System.out.print(" "+(2 * n - 1));
        odd(n - 1);
    }
}
