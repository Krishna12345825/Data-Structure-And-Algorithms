package Tap.RunningClass.Strings.Day6_ProgramOnSubArray;

import java.util.Scanner;


/*
* Given two String, check second Strings are present in the first String or not if yes then print yes otherwise no
*input1:-   mississippi
* input2:-  issi
* output:-  yes
* */
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input1 = scanner.nextLine();
        String ans = printSubString(input, input1);
        System.out.println(ans);
    }
    static String printSubString(String s, String s2){
        int size = s2.length();
        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < i+ size; j++) {
                t = t + s.charAt(j);
            }
            if (t.equals(s2)) {
                return "Yes";
            }
        }
        return "No";
    }
}
