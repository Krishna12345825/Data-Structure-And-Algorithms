package TapDSA.Mathematics;

public class Q4PrimeNUmbers {
    public static void main(String[] args) {
        int n= 13;
//        System.out.println(isPrime1(n));
        System.out.println(isPrime2(n));
    }

    public static boolean isPrime1(int n){
        for (int i = 2; i<=n/2; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int n){
        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
