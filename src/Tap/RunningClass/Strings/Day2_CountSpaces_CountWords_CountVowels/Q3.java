package Tap.RunningClass.Strings.Day2_CountSpaces_CountWords_CountVowels;

// count consonent

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        int ans  = countVowel(input);
        System.out.println(ans);
    }

    static int countVowel(String s){
        int count  = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ||
            ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
}
