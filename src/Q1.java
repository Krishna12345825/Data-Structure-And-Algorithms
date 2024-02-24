import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


    }

    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i <= j){
            if (s.charAt(i) ==  s.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }


}
