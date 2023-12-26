package Tap.DSA.Recursion;

public class Q11_JosephusProblem {
    public static void main(String[] args) {
        int n = 7;
        int  k =3;
       int ans = jos(n, k);
        System.out.println("The right position:-  " + ans);
    }

    static int jos(int n, int k){
        if (n == 1)
            return 0;
        return (jos(n-1, k) + k) % n;
    }
}
