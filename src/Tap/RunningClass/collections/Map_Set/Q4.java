package Tap.RunningClass.collections.Map_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;


/*
input:- mississippi
*/
public class Q4 {

    static String removeDuplicates(String s) {

       // HashSet<Character> set = new HashSet<>();
     //   LinkedHashSet<Character> set = new LinkedHashSet<>();
        TreeSet<Character> set = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            set.add(ch);
        }

        String t = "";
        for (char x : set) {
            t = t + x;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String rsult = removeDuplicates(s);
        System.out.println(rsult);
    }
}
