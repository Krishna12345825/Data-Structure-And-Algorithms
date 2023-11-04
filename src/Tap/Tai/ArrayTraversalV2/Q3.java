package Tap.Tai.ArrayTraversalV2;

/*
Occurrence of Largest Element in an Array
        Write a program to find the occurrence of the largest element in an array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print the occurrence of largest element

        Sample Inputs & Outputs
        Sample Input 1
        4
        1 2 3 4
        Sample Output 1
        1
        Sample Input 2
        7
        1 2 3 4 5 6 7
        Sample Output 2
        1
*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
       int result = countLargestElements(arr);
        System.out.println(result);
    }
    static int countLargestElements(int arr[]){
        int count = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                count = 1;
            } else if (arr[i] == max) {
                count++;
            }
        }
        return count;
    }
}
