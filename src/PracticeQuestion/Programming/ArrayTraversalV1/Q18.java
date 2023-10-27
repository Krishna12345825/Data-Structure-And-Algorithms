package PracticeQuestion.Programming.ArrayTraversalV1;

/*
Even Index Elements
        Write a program to print numbers present in the even index of an array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print space separated integer values stored in the even index of the array.

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        1 6 10
        Sample Input 2
        4
        20 30 40 50
        Sample Output 2
        20 40
*/


import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
       evenIndexElements(arr);
    }

    static void evenIndexElements(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
