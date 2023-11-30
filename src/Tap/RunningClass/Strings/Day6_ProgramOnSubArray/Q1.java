package Tap.RunningClass.Strings.Day6_ProgramOnSubArray;

import java.util.Scanner;


/*
* print subArray
* */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int k = scanner.nextInt();
        printSubString(input, k);
    }
    static void printSubString(String s, int size){
        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < i+ size; j++) {
                t = t + s.charAt(j);
            }
            System.out.println(t);
        }

    }


}
