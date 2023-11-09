package Tap.Tai.Q4ArrayTraversalV1;

/*
Largest Element in an Array
        Write a program to find the largest element in a given array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print largest element in an array

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 5 7 3 2
        Sample Output 1
        7
        Sample Input 2
        6
        0 -1 -2 -3 -4 -5
        Sample Output 2
        0
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = maxElement(arr);
        System.out.println(result);
    }
    static  int maxElement(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
