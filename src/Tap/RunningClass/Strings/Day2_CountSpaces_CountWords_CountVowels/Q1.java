package Tap.RunningClass.Strings.Day2_CountSpaces_CountWords_CountVowels;

import java.util.Scanner;

// count spaces
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int ans = countSpaces(input);
        System.out.println(ans);

    }
    static int countSpaces(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }


}
