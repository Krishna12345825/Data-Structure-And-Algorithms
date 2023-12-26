package Tap.DSA.Recursion;

public class Q2Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
//        if(n<=1)
        if (n == 0 || n == 1)
            return 1;
        return n*factorial(n-1);
    }
}
