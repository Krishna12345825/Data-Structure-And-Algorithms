package assignments.saurabhSukhla.recursion;

//2. Write a recursive function to print first N natural numbers in reverse order
public class Q2PrintFirstNNaturalReverseOrder {
    public static void main(String[] args) {
        int n = 10;
        reverse(n);
    }

    public static void reverse(int n) {
        if (n == 0)
            return;
        System.out.print(" " + n);
        reverse(n - 1);
    }
}
