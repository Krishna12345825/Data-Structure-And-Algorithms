package Tap.Tai.Q10_StringTraversal_Level1;

import java.util.Scanner;

/*

Even Index Character Printer

input:
TapAcad
output:
T
p
c
d
*/

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  s = scanner.next();
        evenIndex(s);
    }

    static void evenIndex(String s){
        for (int i = 0; i<s.length(); i++){
            if (i % 2 == 0){
                System.out.println(s.charAt(i));
            }
        }
    }
}
