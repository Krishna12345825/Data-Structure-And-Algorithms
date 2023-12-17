package Tap.RunningClass.Arrays.Day18_ProgramOnSubArrays;


/*

Given an array of size N, print the count of subarrays of given size whose sum is equal to k
input:-
9
5 1 2 4 9 3 1 3 3
3 (size)
k = 7
output:-
3
*/


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        countOfSubArraySumEqualTOK(arr, size, k);
    }

    static void countOfSubArraySumEqualTOK(int arr[], int size, int k){
        int count = 0;
        for (int i = 0; i<= arr.length - size; i++){
            int sum = 0;
            for (int j = i; j < i + size; j++){
                sum = sum + arr[j];
            }
            if (sum == k){
               count++;
            }
        }
        System.out.println(count);
    }

}
