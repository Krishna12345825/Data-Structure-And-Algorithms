package Tap.RunningClass.Arrays.Day18_ProgramOnSubArrays;


/*

Given an array of size N, print the sum of all subarrays of given size
input:-
9
5 1 2 4 9 3 1 3 3
3 (size)

output:-
8
7
15
16
13
7
7

*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int size  = scanner.nextInt();
        sumOfAllSubArray(arr, size);
    }

    static void sumOfAllSubArray(int arr[], int size) {
        for (int i = 0; i <= arr.length - size; i++) {
        int sum = 0;
        for (int j = i; j < i + size; j++){
            sum = sum + arr[j];
        }
            System.out.println(sum);
        }
    }
}
