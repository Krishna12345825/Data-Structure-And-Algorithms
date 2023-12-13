package Tap.Tai.Q6_ArrayPairs;

import java.util.Scanner;
/*

Pair  with Minimum Sum
Sample input :-
6
2 4 6 3 8 9
sample output:-
2 3
Sample input :-
4
1 2 3 4
sample output:-
1 2
*/


public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        pairWithMinimumSum(arr);
    }


    static void pairWithMinimumSum(int arr[]){
        int min1 = Integer.MAX_VALUE;
        int num1 = 0, num2 =0;
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum < min1){
                    min1 = sum;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println(num1 + " "+ num2);
    }
}
