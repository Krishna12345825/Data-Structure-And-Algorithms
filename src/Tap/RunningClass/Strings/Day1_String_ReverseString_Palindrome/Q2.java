package Tap.RunningClass.Strings.Day1_String_ReverseString_Palindrome;


import java.util.Scanner;

/*Given String check given String is prime or not*/
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        checkPrime(input);
    }

    static void checkPrime(String s){
        String t = "";
        for (int i = s.length()-1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        System.out.println(s.equals(t) ? "Palindrome " : "Non Palindrome");
    }


}
