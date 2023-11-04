package Tap.DSA.Arrays;

public class Q20SquareRootOfANumber {
    public static void main(String[] args) {
        int n= 25;
        System.out.println(squareRoot(n));
    }

    public static int squareRoot(int n){
        if (n==1 || n==0){
            return n;
        }
        int start=0;
        int end = n/2;
        int result  =0;
        while (start<=end){
            int mid  = start+(end-start)/2;
            if (mid*mid==n){
                return mid;
            }else if (mid*mid<n){
                start =mid+1;
                result =mid;
            }else {
                end =mid-1;
            }
        }
        return result;
    }
}
