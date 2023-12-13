package Tap.Tai.Q4_ArrayTraversalV1;

/*
Print Array Elements
        Take the size of an array and its elements as input from the user and print the elements of the array.

        Input Format
        The function interacts with the user through standard input (console).

        Output Format
        Print the array elements on a single line, each element separated by a space.

        Sample Inputs & Outputs
        Sample Input 1
        4
        2 4 5 6
        Sample Output 1
        2 4 5 6
        Sample Input 2
        5
        11 22 33 44 55
        Sample Output 2
        11 22 33 44 55
*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printElements(arr);
    }

    static void printElements(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
