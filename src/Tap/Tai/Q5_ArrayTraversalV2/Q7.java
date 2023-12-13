package Tap.Tai.Q5_ArrayTraversalV2;
/*
Reverse Array Elements
        Write a program to print numbers present in each index in an array in reverse order.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print space separated integer values stored in each index in the array in reverse order.

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        10 3 6 4 1
        Sample Input 2
        4
        20 30 40 50
        Sample Output 2
        50 40 30 20
        Constraints
        1 <= N <= 10^3
        -10^6 <= array elements <= 10^6
*/


import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
       int arr1[] = reverseArrayElements(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }

    static int[] reverseArrayElements(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
