package Tap.Tai.Q4_ArrayTraversalV1;

/*
Print Odd Number Elements in an Array
        Print odd number elements of the array.
        Input Format
        The function should prompt the user to enter the size of the array and the array elements.

        Output Format
        Print the odd number elements on a single line, each element separated by a space.

        Sample Inputs & Outputs
        Sample Input 1
        3
        2 1 6
        Sample Output 1
        1
        Sample Input 2
        7
        1 2 3 4 5 6 7
        Sample Output 2
        1 3 5 7
        Constraints
        The size of the array is a positive integer.
        The elements of the array are integers.
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
        oddElements(arr);
    }

    static void oddElements(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

}
