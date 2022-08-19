package assignments.saurabhSukhla.recursion;
//8. Write a recursive function to calculate sum of first N natural numbers

public class Q8SumOfFirstNNumber {
    public static void main(String[] args) {
        int n = 10;
        int ans = sum1(n);
        System.out.println(ans);
    }
    public static int sum1(int n) {
        if (n <= 1)
            return 1;
        return n + sum1(n - 1);
    }
}
