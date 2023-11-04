package Tap.DSA.Mathematics;

public class Q5PrimeNumberBetweenRange {
    public static void main(String[] args) {
        int n=100;
        printPrimes(n);
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <=n/2; i++) {
            if (n%2==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int n){
        for (int i = 2; i <=n; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
