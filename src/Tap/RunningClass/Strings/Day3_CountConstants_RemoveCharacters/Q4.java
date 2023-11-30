package Tap.RunningClass.Strings.Day3_CountConstants_RemoveCharacters;


import java.util.Scanner;

// Rearrange the character
// input:- He2L4Lo8#3s
// output: HeLLos17
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        String ans = rearrange(input);
        System.out.println(ans);
    }
    static String rearrange(String s){
        String t = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                t = t+ ch;
            } else if (ch >= '0' && ch <= '9') {
                sum = sum + ch - 48;
            }
        }
        return  t + sum;
    }

}
