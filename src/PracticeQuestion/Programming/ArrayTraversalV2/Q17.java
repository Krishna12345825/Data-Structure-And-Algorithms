package PracticeQuestion.Programming.ArrayTraversalV2;

/*
Index of K Value in Array
        The goal of this task is to write a Java program that finds the index of a given value K in a given array. If K is not found in the array, the program should print -1.

        Input Format
        The first line contains a single integer, N, representing the size of the array.

        The second line contains N space-separated integers, representing the elements of the array.

        The third line contains a single integer, K, representing the value to be found.

        Output Format
        Print the index of the first occurrence of K in the array. If K is not found, print -1.

        Sample Inputs & Outputs
        Sample Input 1
        7
        5 9 2 8 3 7 2
        2
        Sample Output 1
        2
        Sample Input 2
        6
        1 4 6 3 10 8
        5
        Sample Output 2
        -1
        Constraints
        1 ≤ N ≤ 10^5 (the size of the array),

        -10^9 ≤ elements of the array ≤ 10^9,

        -10^9 ≤ K ≤ 10^9
*/

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int result = indexKValue(arr, k);
        System.out.println(result);
    }

    static int indexKValue(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return k;
            }
        }
        return -1;
    }

}
