package Tap.RunningClass.Arrays.Day20_ConsecutiveSubArrays;
/*

Given an array of size N, print the length of all subArrays that are consecutive
input:-
10
5 12 13 14 9 2 3 4 5 6
output:-
1
3
1
5
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
        consecutiveSubArrayLength(arr);
    }

    static void consecutiveSubArrayLength(int arr[]){
        int count  = 1;
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i+1] - arr[i] == 1){
                count++;
            }else {
                System.out.println(count);
                count = 1;
            }
        }
        System.out.println(count);
    }
}
