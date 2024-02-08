package Tap.Tai.Q10_StringTraversal_Level1_COmpleted;
/*

print all characters

input :   KrishnaKumar
output:
k
r
i
s
h
n
a
K
u
m
a
r
*/


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        printAllCharector(s);
    }

    static void printAllCharector(String s){
        for (int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }

}
