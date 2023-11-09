package Tap.Tai.Q5ArrayTraversalV2;

/*
Reverse Even Array
        Write a program to print even numbers present in an array in reverse order.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print space separated even integer values stored in an array in reverse order.

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        10 6 4
        Sample Input 2
        6
        2 3 4 5 6 7
        Sample Output 2
        6 4 2
*/

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        reverseEvenArray(arr);
    }

    static void reverseEvenArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
