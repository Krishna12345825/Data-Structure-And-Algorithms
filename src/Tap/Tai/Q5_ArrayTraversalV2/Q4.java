package Tap.Tai.Q5_ArrayTraversalV2;

/*
Occurrence of Smallest Element in an Array
        Write a program to find the occurrence of the smallest element in an array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print the occurrence of smallest element

        Sample Inputs & Outputs
        Sample Input 1
        4
        1 2 3 1
        Sample Output 1
        2
        Sample Input 2
        7
        1 2 3 4 5 6 1
        Sample Output 2
        2
*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = smallestElement(arr);
        System.out.println(result);
    }
    static int smallestElement(int arr[]){
        int min = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                count = 1;
            } else if (arr[i] ==min) {
                count++;
            }
        }
        return count;
    }
}
