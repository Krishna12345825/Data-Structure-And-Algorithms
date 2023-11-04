package Tap.Tai.ArrayTraversalV2;

/*
Divisible Elements Print
        Write a program to print the elements which are divisible by 2 and 3 in an array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print elements which are divisible by 2 and 3 in an array

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        6
        Sample Input 2
        5
        2 3 6 9 12
        Sample Output 2
        6 12
*/


import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        divisibleElements(arr);
    }

    static void divisibleElements(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2==0 && arr[i]%3==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
