package Tap.Tai.Q6_ArrayPairs;

/*
Pairs with Sum Greater than k
        Print all pairs of numbers from the input array whose sum is greater than the sum value k.
        Input Format
        The first line contains an Integer N, representing the size of the array.
        The second line contains N space-separated integers, representing the elements of the array.
        The third line contains a single integer k, representing the target sum value.
        Output Format
        Print each pair of numbers on a new line, separated by a space.
        Sample Inputs & Outputs
        Sample Input:
        6
        2 4 6 3 8 9
        7
        sample output:-
2 6
2 8
2 9
4 6
4 8
4 9
6 3
6 8
6 9
3 8
3 9
8 9

Sample Input:
4
1 2 3 4
6
sample output:-
3 4


*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        sumGreaterK(arr, k);
    }

    static  void sumGreaterK(int arr[], int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum  = arr[i] + arr[j];
                if (sum > k){
                    System.out.print(arr[i]+" "+arr[j]);
                }
                System.out.println();
            }
        }
    }
}
