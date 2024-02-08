package Tap.Tai.Q10_StringTraversal_Level1;

import java.util.Scanner;

/*

Consonent Count in String

input:
        Hello, World!
        output:
        7

*/

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = constantCount(s);
        System.out.println(result);
    }

    static int constantCount(String s){
        int count  = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                        ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                    count++;
                }
            }
        }
        return count;
    }
}
