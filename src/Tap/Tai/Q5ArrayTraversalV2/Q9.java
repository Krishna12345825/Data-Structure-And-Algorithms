package Tap.Tai.Q5ArrayTraversalV2;

/*
Odd Elements Sum
        Write a program to find the sum of all odd elements present in an array.
        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print sum of all odd elements in an array.

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        4
        Sample Input 2
        6
        1 2 3 4 5 6
        Sample Output 2
        9
        Constraints
        1 <= N <= 10^3 -10^6 <= array elements <= 10^6
*/

import java.util.Scanner;

public class Q9 {
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
            if (arr[i] %2 !=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
