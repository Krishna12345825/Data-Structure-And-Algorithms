package PracticeQuestion.Programming.ArrayTraversalV2;

/*
Even, Odd and Negative Elements in Array
        Write a program to print negative elements, even elements and odd elements present in an array separately.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        First line prints space separated negative elements in an array.

        Second line prints space separated odd elements in an array.

        Third line prints space separated even elements in an array.

        Sample Inputs & Outputs
        Sample Input 1
        6
        1 -4 -6 3 10 -20
        Sample Output 1
        -4 -6 -20
        1 3
        10
        Sample Input 2
        5
        5 -10 -15 20 -25
        Sample Output 2
        -10 -15 -25
        5
        20
*/


import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printNegativeElements(arr);
        printOddElements(arr);
        printEvenElements(arr);
    }
    static void printNegativeElements(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    static void printOddElements(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    static void printEvenElements(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2== 0) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
