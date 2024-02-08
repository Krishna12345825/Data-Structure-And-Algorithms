package Tap.Tai.Q10_StringTraversal_Level1;

import java.util.Scanner;
/*

Vowel Count in String

input1:
Hello, WOrld
output1:
3

*/

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = countVowel(s);
        System.out.println(result);
    }

    static int countVowel(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A' ||  ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
}
