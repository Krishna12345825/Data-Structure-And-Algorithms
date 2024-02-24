import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
       printN(input);

    }

    public static void printN(int n ){
        for (int i = 0; i <=n; i++) {
            if (isPalindrome(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int n){
        if(n <=1){
            return false;
        }

        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % 2 == 0){
                return false;
            }
        }
        return true;

    }



}
