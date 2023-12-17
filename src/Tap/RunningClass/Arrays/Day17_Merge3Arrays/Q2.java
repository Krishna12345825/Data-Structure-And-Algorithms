package Tap.RunningClass.Arrays.Day17_Merge3Arrays;
/*

Given an array of size N, print all the subarrays of size 3.
input:-
9
5 1 2 4 9 3 1 3 3

output:-

5 1 2
1 2 4
2 4 9
4 9 3
9 3 1
3 1 3
1 3 3


*/


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int size  = scanner.nextInt();
        sabArray(arr, size);
    }

    static void sabArray(int arr[], int size){
        for (int i = 0; i <= arr.length - size; i++){
            for (int j = i; j < i + size; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }


}
