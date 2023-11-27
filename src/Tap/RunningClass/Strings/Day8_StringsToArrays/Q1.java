package Tap.RunningClass.Strings.Day8_StringsToArrays;


import java.util.Scanner;

/*  Input :-  How   are   you
   outPut:-  How
             are
            you*/


public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String arr[] = split(s);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int countWords(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return s.charAt(0) == ' ' ? count : count + 1;
    }


    static String[] split(String s) {
        int wordCount = countWords(s);
        String[] arr = new String[wordCount];
        String t = "";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                t = t + s.charAt(i);
            } else if (t.length() > 0) {
                arr[j] = t;
                j++;
                t = "";
            }
        }
        arr[j] = t;
        return arr;
    }

}
