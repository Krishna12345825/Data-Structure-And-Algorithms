package Tap.RunningClass.Strings.Day2_CountSpaces_CountWords_CountVowels;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        int ans  = countConsonents(input);
        System.out.println(ans);
    }

    static int countConsonents(String s){
        int count  = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
           if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
               if (!((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ||
                       (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))){
                   count++;
               }
           }
        }
        return count;
    }
}
