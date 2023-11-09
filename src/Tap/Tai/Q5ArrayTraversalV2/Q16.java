package Tap.Tai.Q5ArrayTraversalV2;

/*
Swapping Indexes in an Array
        Write a program to swap all the even index elements with odd index elements.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print the required output

        Sample Inputs & Outputs
        Sample Input 1
        4
        1 2 3 4
        Sample Output 1
        Before Swapping:
        1 2 3 4
        After Swapping:
        2 1 4 3
        Sample Input 2
        7
        1 2 3 4 5 6 7
        Sample Output 2
        Before Swapping:
        1 2 3 4 5 6 7
        After Swapping:
        2 1 4 3 6 5 7
*/

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Swapping:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        swapElements(arr);
        System.out.println("After Swapping:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swapElements(int arr[]) {
        for (int i = 0; i < arr.length -1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
