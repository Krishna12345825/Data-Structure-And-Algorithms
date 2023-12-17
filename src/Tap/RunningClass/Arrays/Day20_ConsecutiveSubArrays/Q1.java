package Tap.RunningClass.Arrays.Day20_ConsecutiveSubArrays;


/*
Given an Array of Size N, print all the subArrays that are consecutive
input :-
10
5 12 13 14 9 2 3 4 5 8
output:-
5
12 13 14
9
2 3 4 5
8
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
        consecutiveSubArrays(arr);
    }

    static void consecutiveSubArrays(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            if (arr[i+1] - arr[i] == 1){
                System.out.print(arr[i]+" ");
            }else {
                System.out.print(arr[i]+" ");
                System.out.println();
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}
