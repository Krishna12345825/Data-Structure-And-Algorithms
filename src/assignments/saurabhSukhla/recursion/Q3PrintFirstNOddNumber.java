package assignments.saurabhSukhla.recursion;

//3. Write a recursive function to print first N odd natural numbers
public class Q3PrintFirstNOddNumber {
    public static void main(String[] args) {
        int n = 10;
        odd(n);
    }

    public static void odd(int n) {
        if (n == 1)
            return;
        odd(n - 1);
        System.out.print("  "+(2 * n - 1));
    }
}
