package Tap.Tai.Q10_StringTraversal_Level1;

import java.util.Scanner;
/*

String Cancatenator

input1:
krishna
Kumar
output:
krishnaKumar
*/



public class Q3 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        stringCancatination(s1,s2);
    }

    static void stringCancatination(String s1, String s2){
//        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
    }
}
