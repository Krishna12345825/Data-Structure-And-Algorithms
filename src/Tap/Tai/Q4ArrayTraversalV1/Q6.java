package Tap.Tai.Q4ArrayTraversalV1;

/*
Array Elements Sum
        Write a program to find the sum of all elements present in an array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print sum of all elements in an array.

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        24
        Sample Input 2
        6
        1 2 3 4 5 6
        Sample Output 2
        21
*/

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = sumElements(arr);
        System.out.println(result);
    }
    static int sumElements(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
