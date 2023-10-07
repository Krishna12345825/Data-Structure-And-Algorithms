package TapDSA.Mathematics;

public class Q4PrimeNUmbers {
    public static void main(String[] args) {
        int n= 13;
//        System.out.println(isPrime1(n));
//        System.out.println(isPrime2(n));
        System.out.println(checkPrime(n));
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


    public static boolean checkPrime(int n){
        if (n==1){
            return false;
        }
        if (n==2 || n==3){
            return true;
        }
        if (n%2==0 || n%3==0){
            return false;
        }
        for (int i = 5; i*i<=n; i=i+6) {
            if (n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
