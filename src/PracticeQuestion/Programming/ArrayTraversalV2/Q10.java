package PracticeQuestion.Programming.ArrayTraversalV2;

/*
  Sum Divisible Elements
        Write a program to find the sum of elements which are divisible by 3 and 5 in an array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print sum of elements which are divisible by 3 and 5 in an array

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        0
        Sample Input 2
        5
        15 30 35 40 45
        Sample Output 2
        90
   */

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = oddElementSum(arr);
        System.out.println(sum);
    }
    static int oddElementSum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %3 == 0 && arr[i] %5 == 0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
