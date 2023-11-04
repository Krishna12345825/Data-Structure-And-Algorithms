package Tap.Tai.ArrayTraversalV2;

/*
Odd Numbers Array
        Write a program to print odd numbers present in an array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print space separated odd integer values stored in an array.

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        1 3
        Sample Input 2
        4
        21 31 41 51
        Sample Output 2
        21 31 41 51
*/


import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        oddNumberArray(arr);
    }
    static  void oddNumberArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 !=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
