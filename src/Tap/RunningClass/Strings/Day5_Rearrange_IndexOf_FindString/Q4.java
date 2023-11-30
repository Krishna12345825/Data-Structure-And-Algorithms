package Tap.RunningClass.Strings.Day5_Rearrange_IndexOf_FindString;

import java.util.Scanner;

/*
* Given two Strings, check weather the second String is present in the first  String in the same order or not
* input1 :-  hereiamstackerrank
* input2 :- hackerrank
* output:- yes
* */
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String k = scanner.nextLine();
        String ans = findString(input, k);
        System.out.println(ans);
    }

    static String findString(String s, String t){
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else {
                i++;
            }
        }
        return j == t.length() ? "Yes" : "No";
    }
}
