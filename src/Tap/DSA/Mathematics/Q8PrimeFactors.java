package Tap.DSA.Mathematics;

public class Q8PrimeFactors {
    public static void main(String[] args) {
        int n=12;
        primeFactors(n);
    }

    public static void primeFactors(int n){
        int i=2;
        while (n>1){
            while (n%i==0){
                System.out.print(i+" ");
                n = n/i;
            }
            i++;
        }
    }
}
