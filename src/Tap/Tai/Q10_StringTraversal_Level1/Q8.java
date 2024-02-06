package Tap.Tai.Q10_StringTraversal_Level1;

import java.util.Scanner;

/*

Palindrome Cheker

input1:
radar
output1:
Yes

input2:
krishna
output2:
no

*/

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String  result = isPalindrome(s);
        System.out.println(result);
    }

    static String isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i <= j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else {
                return "No";
            }
        }
        return "Yes";
    }
}
