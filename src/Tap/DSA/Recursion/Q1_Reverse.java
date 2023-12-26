package Tap.DSA.Recursion;

// reverse number
public class Q1_Reverse {
    public static void main(String[] args) {
        int n = 10;
        fun(n);
    }
    static  void fun(int n){
        if (n < 1){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
