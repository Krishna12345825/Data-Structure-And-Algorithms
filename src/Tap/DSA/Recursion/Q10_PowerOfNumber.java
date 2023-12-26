package Tap.DSA.Recursion;
// Power of Number
public class Q10_PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(powerOf(2, 3));
    }

    public static long  powerOf(int x, int y){
        if (y==0){
            return 1;
        }
        if (y%2==0){
            long res=powerOf(x,y/2);
            return res * res;
        }else {
            return powerOf(x, y-1)*x;
        }
    }
}
