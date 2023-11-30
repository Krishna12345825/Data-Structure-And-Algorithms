package Tap.RunningClass.Strings.Day4_Swapp_Cases_RemoveSpaces;

import java.util.Scanner;

/*Convert to upperCase
* input:- Helllo@123
* output:-
* */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ans = toUpperCase(input);
        System.out.println(ans);
    }
    static  String toUpperCase(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z')){
                t = t + (char) (ch - 32);
            }else {
                t = t + ch;
            }
        }
        return t;
    }


}
