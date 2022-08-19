package assignments.saurabhSukhla.recursion;
//9. Write a recursive function to calculate sum of first N odd natural numbers

public class Q9SumOfFirstNNaturalOddNumber {
    public static void main(String[] args) {
        int n = 10;
        int ans = odd(n);
        System.out.println(ans);
    }

    public static int odd(int n) {
        if (n <= 1)
            return 1;
        return n+odd((2 * n-1) - 1);
    }
}
