package Tap.Tai.Q10_StringTraversal_Level1_COmpleted;
/*

Index Character printer
Input:
KrishnaKumar
3
output:
i
*/


import java.util.Scanner;

public class Q4 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        indexCharacter(s, k);
    }
    static void indexCharacter(String s, int k){
        if (k >=0 && k<s.length()){
            System.out.println(s.charAt(k));
        }else {
            System.out.println("Invalid index");
        }
    }

}
