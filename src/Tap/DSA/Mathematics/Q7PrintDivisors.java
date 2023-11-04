package Tap.DSA.Mathematics;
// print all the divisors of a given  number n
public class Q7PrintDivisors {
    public static void main(String[] args) {
        int n = 12;
//        printDivisors1(n);
        printDivisors2(n);
    }

    public static void printDivisors1(int n){
        for (int i = 1; i <=n; i++) {
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    
    public static void printDivisors2(int n){
        int i=0;
        for ( i = 1; i*i<=n ; i++) {
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
        for (; i >=1 ; i--) {
            if (n%i==0){
                System.out.print(n/i+" ");
            }
        }
    }

}
