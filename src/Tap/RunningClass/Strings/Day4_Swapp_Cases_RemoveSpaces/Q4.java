package Tap.RunningClass.Strings.Day4_Swapp_Cases_RemoveSpaces;


import java.util.Scanner;

/* Given a String, remove all the extra spaces present in String
* input:   --------------how---------are-------you---------
* output:-  how-are-you
* */

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ans = trim(input);
        System.out.println(ans);

    }
    static String trim(String s){
        int startingIndex = 0, endingIndex = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                startingIndex = i;
                break;
            }
        }

        for (int j = s.length()-1; j >= 0 ; j--) {
            if (s.charAt(j) != ' '){
                endingIndex = j;
                break;
            }
        }

        String t = "";
        for (int i = startingIndex; i <= endingIndex; i++) {
            if (s.charAt(i) != ' ' || (s.charAt(i) == ' ' && s.charAt(i+1)!= ' ')){
                t = t + s.charAt(i);
            }
        }
        return t;
    }

}
