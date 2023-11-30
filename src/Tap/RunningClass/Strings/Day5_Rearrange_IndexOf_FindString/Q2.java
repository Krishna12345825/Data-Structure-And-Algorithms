package Tap.RunningClass.Strings.Day5_Rearrange_IndexOf_FindString;

import java.util.Scanner;

/*
 * Given a String, convert the String & print the following output
 * input:-  banana
 * output:- b*n*n*
 * */

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ans = rearrange(input);
        System.out.println(ans);
    }
    static String rearrange(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'){
                t = t + "*" ;
            }else {
                t = t + s.charAt(i);
            }
        }
        return t;
    }

}
