package Tap.RunningClass.Strings.Day6_ProgramOnSubArray;

import java.util.Scanner;


/*
* Given two String, print the number of occurance of second String in the first String
*input1:-   mississippi
* input2:-  issi
* output:-  2
*
* */
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input1 = scanner.nextLine();
        int ans = printSubString(input, input1);
        System.out.println(ans);
    }
    static int printSubString(String s, String s2){
        int size = s2.length();
        int count = 0;
        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < i+ size; j++) {
                t = t + s.charAt(j);
            }
            if (t.equals(s2)) {
                count++;
            }
        }
        return count;
    }
}
