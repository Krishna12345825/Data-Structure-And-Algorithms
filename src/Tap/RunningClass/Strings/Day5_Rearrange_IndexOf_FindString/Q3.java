package Tap.RunningClass.Strings.Day5_Rearrange_IndexOf_FindString;

import java.util.Scanner;

/*  Given a String & character, print the index of the charecter
* input:-s1 :-  matrix
* input s2 :- r
* output:- 3
* */
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char k = scanner.next().charAt(0);
        int ans = printIndex(input, k);
        System.out.println(ans);
    }

    private static int printIndex(String input, char k) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == k){
                return i;
            }
        }
        return -1;
    }
}
