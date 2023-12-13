package Tap.Tai.Q5_ArrayTraversalV2;

/*
Index of Largest Element
        View Instructions
        Solved in 1 attempts
        Marks Obtained: 100 / 100
        Easy
        Find the index of the largest element in an array.

        Input Format
        The first line contains an integer 'n' (1 <= n <= 100), representing the size of the array.

        The second line contains 'n' space-separated integers, representing the elements of the array.

        Output Format
        Print the index of the largest element in the array.

        Sample Inputs & Outputs
        Sample Input 1
        5
        10 7 15 4 8
        Sample Output 1
        2
        Sample Input 2
        4
        1 8 3 9
        Sample Output 2
        3
  */

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result =  indexLargestElement(arr);
        System.out.println(result);
    }

    static int indexLargestElement(int arr[]){
        int max = arr[0], index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
