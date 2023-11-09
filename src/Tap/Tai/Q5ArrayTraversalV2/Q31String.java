package Tap.Tai.Q5ArrayTraversalV2;

/*
Last Occurrence Index Finder
        Find the index of the last occurrence of a given character in a string.

        Input Format
        The first line contains a string.

        The second line contains a single character

        Output Format
        The program outputs a single line containing the index of the last occurrence of the given character in the input string.

        Sample Inputs & Outputs
        Sample Input 1
        Hello World!
        o
        Sample Output 1
        7
        Sample Input 2
        Tapacademy
        a
        Sample Output 2
        5
*/

import java.util.Scanner;

public class Q31String{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String str = scanner.nextLine();
        char k = scanner.next().charAt(0);
        int result = lastOccuranceIndex(str, k);
        System.out.println(result);
    }
    static int lastOccuranceIndex(String str, char k){
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == k){
                index = i;
            }
        }
        return index;
    }
}

