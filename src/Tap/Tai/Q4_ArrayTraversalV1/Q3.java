package Tap.Tai.Q4_ArrayTraversalV1;

/*
Smallest Element in an Array
        Easy
        Write a program to find the smallest element in a given array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print smallest element in an array

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 5 7 3 2
        Sample Output 1
        1
        Sample Input 2
        6
        0 -1 -2 -3 -4 -5
        Sample Output 2
        -5
*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = smallestElements(arr);
        System.out.println(result);
    }

    static int smallestElements(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
