package Tap.RunningClass;

import java.util.Scanner;

/*
 SubArray
 Given an size of an array of size n, and count the subarray of target value
*/

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = longestSubarrayWithSumK(arr, k);
        System.out.println(result);
    }
    public static int longestSubarrayWithSumK(int []a, int k) {
        int count = 0;
        for (int size = a.length; size >0; size--) {
            for (int i = 0; i <a.length - size; i++) {
                int sum = 0;
                for (int j = i; j < size + i; j++) {
                    sum = sum + a[j];
                }
                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
