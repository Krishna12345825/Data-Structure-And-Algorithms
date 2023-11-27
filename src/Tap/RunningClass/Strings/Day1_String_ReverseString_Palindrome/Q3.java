package Tap.RunningClass.Strings.Day1_String_ReverseString_Palindrome;

/*Given String check given String is prime or not*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ans = palindrome(input);
        System.out.println(ans);
    }

    static String  palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i <= j){
         if (s.charAt(i) == s.charAt(j)){
             i++;
             j--;
         }else {
             return "Non - Palindrome";
         }
        }
        return "Palindrome";
    }

}
