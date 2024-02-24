import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s = longestPalindromicSubstring(input);
        System.out.println(s);
    }



    static String longestPalindromicSubstring(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                if (palindrome (substr) && substr.length() > longestPalindrome.length()) {
                    longestPalindrome = substr;
                }
            }
        }
        return longestPalindrome;
    }

    static boolean  palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i <= j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }

}
