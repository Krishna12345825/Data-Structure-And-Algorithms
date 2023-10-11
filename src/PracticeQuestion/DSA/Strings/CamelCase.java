package PracticeQuestion.DSA.Strings;

import java.util.Scanner;

public class CamelCase {
    static int camelCase(String s) {
        int count = 1;
        for(int i=0; i<s.length(); i=i+3) {
            if(s.charAt(i) >= 'A'
                    && s.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(camelCase(s));
    }
}
