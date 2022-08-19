package assignments.saurabhSukhla.recursion;
//7. Write a recursive function to print squares of first N natural numbers

public class Q7PrintSquareOfFirstNNumber {
    public static void main(String[] args) {
        int n = 10;
        square(n);
    }

    public static void square(int n) {
        if (n == 0)
            return;
        square(n - 1);
        System.out.print(" " + (n * n));
    }
}
