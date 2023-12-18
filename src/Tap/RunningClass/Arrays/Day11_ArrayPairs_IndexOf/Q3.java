package Tap.RunningClass.Arrays.Day11_ArrayPairs_IndexOf;

import java.util.Scanner;
/*

  index of elements
  input:-
5
3 4 1 2 5
6
output:-
-1

* */

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int result = printPairsSum(arr, k);
        System.out.println(result);
    }

    static int printPairsSum(int arr[], int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}
