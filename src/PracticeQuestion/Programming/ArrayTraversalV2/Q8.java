package PracticeQuestion.Programming.ArrayTraversalV2;

/*
Odd Index Elements
        Write a program to print numbers present in the odd index of an array.
        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print space separated integer values stored in the odd index of the array.

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        4 3
        Sample Input 2
        4
        20 30 40 50
        Sample Output 2
        30 50
        Constraints
        1 <= N <= 10^3
        -10^6 <= array elements <= 10^6
*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        oddIndexElement(arr);
    }

    static void oddIndexElement(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (i % 2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
