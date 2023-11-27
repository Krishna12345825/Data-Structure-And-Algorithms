package Tap.RunningClass.Strings.Day8_StringsToArrays;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String arr[] = split(s);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print((arr[i])+" ");
        }

    }

    static String reverseString(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            t = s.charAt(i) + t;
        }
        return t;
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
