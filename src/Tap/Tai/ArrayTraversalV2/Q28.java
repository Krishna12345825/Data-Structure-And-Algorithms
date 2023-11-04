package Tap.Tai.ArrayTraversalV2;

/*
Largest Repeating Element (Descending Order)
        Find the largest repeating element in a sorted array in descending order.

        Input Format
        The input consists of two lines:

        The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).

        The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the sorted array (-10^9 ≤ A[i] ≤ 10^9).

        Output Format
        Print a single integer, the largest repeating element in the array. If there are no repeating elements, print -1.

        Sample Inputs & Outputs
        Sample Input 1
        8
        5 4 4 4 3 3 2 1
        Sample Output 1
        4
        Sample Input 2
        6
        6 5 4 3 2 1
        Sample Output 2
        -1
*/


import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result =   largestRepeatingElements(arr);
        System.out.println(result);
    }

    static int largestRepeatingElements(int arr[]){
        int largestRepeatingElemet= -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                largestRepeatingElemet = arr[i];
                break;
            }
        }
        return largestRepeatingElemet;
    }
}
