package Tap.RunningClass.Arrays.Day20_ConsecutiveSubArrays;

/*
Given an array of size n, Print the length of the longest subarray that is consecutive
inputput:-
10
5 12 13 14 9 2 3 4 5 6

output:-
5
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
        countLongestConsecutiveSubArray(arr);
    }

    static void countLongestConsecutiveSubArray(int arr[]) {
        int count = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        if (count > max) {
            max = count;
        }
        System.out.println(max);
    }
}
