package Tap.RunningClass.Arrays.Day18_ProgramOnSubArrays;


/*

Given an array of size N, print all the subarrays of given size whose sum is equal to k
input:-
9
5 1 2 4 9 3 1 3 3
3 (size)
k = 7
output:-

1 2 4
3 1 3
1 3 3




*/


import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        subArraySum(arr, size, k);
    }


    static void subArraySum(int arr[], int size, int k){

        for (int i = 0; i <= arr.length - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + arr[j];
            }
            if (sum == k){
                for (int j = i; j < i + size; j++) {
                    System.out.print(arr[j]+ " ");
                }
                System.out.println();
            }
        }
    }
}


