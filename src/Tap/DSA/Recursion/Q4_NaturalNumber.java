package Tap.DSA.Recursion;

public class Q4_NaturalNumber {
    public static void main(String[] args) {
      natural(5);
    }
    static void natural(int n){
        if(n<=0) {
            return;
        }
         natural(n-1);
        System.out.print(n+" ");
    }
}
