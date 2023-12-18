package Tap.RunningClass.Arrays.Day11_ArrayPairs_IndexOf;

import java.util.Scanner;
/*

  pair sum
  input:-
5
3 4 1 2 5
6
output:-
4 2
1 5

* */

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        printPairsSum(arr, k);
    }

    static void printPairsSum(int arr[], int k){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] + arr[j] == k){
                   System.out.println(arr[i] + " " + arr[j]);
               }
            }
        }
    }
}
