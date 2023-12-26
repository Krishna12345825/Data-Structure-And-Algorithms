package Tap.DSA.Recursion;

public class Q5_CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigit(1234567));
    }
    static int countDigit(int n){
        if (n==0){
            return 0;
        }
        return countDigit(n/10)+1;
    }
}
