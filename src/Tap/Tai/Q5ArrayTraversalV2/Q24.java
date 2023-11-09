package Tap.Tai.Q5ArrayTraversalV2;

  /*
Smallest Repeating Element
        Find the smallest repeating element in a sorted array.

        Input Format
        The input consists of two lines: -

        The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).

        The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the sorted array (-10^9 ≤ A[i] ≤ 10^9).

        Output Format
        Print a single integer, the smallest repeating element in the array. If there are no repeating elements, print -1.

        Sample Inputs & Outputs
        Sample Input 1
        8
        1 2 3 3 4 4 4 5
        Sample Output 1
        3
        Sample Input 2
        6
        1 2 3 4 5 6
        Sample Output 2
        -1
   */

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int smallestRepeatingElement = findSmallestRepeatingElement(arr);
        System.out.println(smallestRepeatingElement);
    }
    public static int findSmallestRepeatingElement(int[] arr) {
        int smallestRepeatingElement = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                smallestRepeatingElement = arr[i];
                break;
            }
        }
        return smallestRepeatingElement;
    }


}
