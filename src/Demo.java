import java.util.*;

class Demo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        sumPrime(arr);
    }

    static  void sumPrime(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (isPrime(sum)){
                    System.out.println(arr[i] +" " + arr[j]);
                }
            }
        }
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i *i<= n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}

