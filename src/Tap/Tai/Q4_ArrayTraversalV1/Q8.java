package Tap.Tai.Q4_ArrayTraversalV1;

/*
Print Even Index Array Elements
        Take the size of an array and its elements as input from the user and print the elements of the array that are located at even indices.

        Input Format
        The function interacts with the user through standard input (console).

        Output Format
        Print the even-indexed array elements on a single line, each element separated by a space.

        Sample Inputs & Outputs
        Sample Input 1
        3
        20 40 60
        Sample Output 1
        20 60
        Sample Input 2
        5
        2 4 6 8 10
        Sample Output 2
        2 6 10
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
        evenIndex(arr);
    }

    static void evenIndex(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 ==0){
                System.out.print(arr[i]+" ");
            }
        }
    }

}
