package Tap.RunningClass.Arrays.Day20_ConsecutiveSubArrays;

/*
Given an array of size n, Print the length of the smallest subArray that is consecutive
input:-
8
11 12 1 2 3 4 5 6

output:-
1
*/


import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        countSmallestConsecutiveSubArray(arr);
    }
    static void countSmallestConsecutiveSubArray(int arr[]){
        int count = 1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i+1] - arr[i] == 1){
                count++;
            }else {
                if (count < min){
                    min = count;
                }
                count = 1;
            }
        }
        if (count < min){
            min = count;
        }
        System.out.println(min);
    }
}
