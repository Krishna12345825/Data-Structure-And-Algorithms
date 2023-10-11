package PracticeQuestion.DSA.Strings;

import java.util.Scanner;

//Mars Exploration
public class MarsExploration {
    static int marsExploration(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i=i+3) {
            if(s.charAt(i) != 'S') {
                count++;
            }
            if(s.charAt(i) != 'O') {
                count++;
            }
            if(s.charAt(i) != 'S') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(marsExploration(s));
    }
}
