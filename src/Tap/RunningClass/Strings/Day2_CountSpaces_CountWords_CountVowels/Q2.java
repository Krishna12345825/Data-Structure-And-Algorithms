package Tap.RunningClass.Strings.Day2_CountSpaces_CountWords_CountVowels;


import java.util.Scanner;

// count words
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        int ans = countWords(input);
        System.out.println(ans);
    }

    static int countWords(String s){
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
                count++;
            }
        }
        return s.charAt(0) == ' ' ? count : count + 1;
    }

}
