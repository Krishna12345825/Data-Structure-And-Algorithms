package Tap.RunningClass.Arrays.Day20_ConsecutiveSubArrays;

import java.util.Scanner;


/*
Given an array of size n, Print the smallest subArray that is consecutive
input:-
8
2 3 4 5 6 12 13 14
output:-
12 13 14

*/


public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        smallestConsecutiveSubArray(arr);
    }

    static void smallestConsecutiveSubArray(int arr[]){
        int count = 1;
        int min = Integer.MAX_VALUE;
        int startingIndex = 0;
        int endingIndex = 0;

        for (int i = 0; i<arr.length-1; i++){
            if (arr[i+1] - arr[i] == 1){
                count++;
            }else {
                if (count < min){
                    min = count;
                    endingIndex = i;
                }
                count = 1;
            }
        }
        if (count < min){
            min = count;
            endingIndex = arr.length-1;
        }
        startingIndex = endingIndex - min + 1;
        for (int i = startingIndex; i <= endingIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
