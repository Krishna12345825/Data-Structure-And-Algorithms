package Tap.Tai.Q4_ArrayTraversalV1;

/* Even Numbers Array
         Write a program to print even numbers present in an array.

         Input Format
         First line contains a single integer N. Next line contains N space separated integer values.

         Output Format
         Print space separated even integer values in an array.

         Sample Inputs & Outputs
         Sample Input 1
         5
         1 4 6 3 10
         Sample Output 1
         4 6 10
         Sample Input 2
         4
         20 30 40 50
         Sample Output 2
         20 30 40 50
         */

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        evenNumber(arr);
    }
   static void evenNumber(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
