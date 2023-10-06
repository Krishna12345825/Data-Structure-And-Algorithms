package TapDSA.Mathematics;

public class Q3TrailingZeros {
    public static void main(String[] args) {
        int n=200;
        System.out.println(tralingzeros(n));
    }

    static  int tralingzeros(int n){
        int res=0;
        int power5=5;
        while (n>=power5){
            res=res+(n/power5);
            power5=power5*5;
        }
        return res;
    }
}
