package PracticeQuestion.Programming.ArrayTraversalV1;

/*
Absolute Sum Array
        Easy
        Write a program to find the absolute sum of all elements present in an array.

        Input Format
        First line contains a single integer N.

        Second line contains N space separated integer values.

        Output Format
        Print Absolute sum of all elements in an array.

        Sample Inputs & Outputs
        Sample Input 1
        6
        1 -4 -6 3 10 -20
        Sample Output 1
        44
        Sample Input 2
        5
        5 -10 -15 20 -25
        Sample Output 2
        75
        Constraints
        1 <= N <= 10^3 -10^6 <= array elements <= 10^6
*/


import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = sumArray(arr);
        System.out.println(result);
    }

    static int sumArray(int []arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + Math.abs(arr[i]);
        }
        return sum;
    }
}
