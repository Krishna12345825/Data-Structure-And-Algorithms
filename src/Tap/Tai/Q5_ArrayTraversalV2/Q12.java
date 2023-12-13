package Tap.Tai.Q5_ArrayTraversalV2;

/*
Second Smallest Number
        Write a program that finds the second smallest number in a given array of integers.

        Input Format
        The first line contains a single integer, N, representing the size of the array. The second line contains N space-separated integers, representing the elements of the array.

        Output Format
        Print the second smallest number in the array.

        Sample Inputs & Outputs
        Sample Input 1
        6
        5 9 2 8 3 7
        Sample Output 1
        3
        Sample Input 2
        7
        10 5 8 2 6 1 4
        Sample Output 2
        2
        Constraints
        - 2 ≤ N ≤ 10^5 (the size of the array)
        -10^9 ≤ elements of the array ≤ 10^9
*/


import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = secondSmallestNumber(arr);
        System.out.println(result);
    }

    static int secondSmallestNumber(int arr[]){
        int min1 = arr[0];
        int min2 = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min1){
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        return min2;
    }
}
