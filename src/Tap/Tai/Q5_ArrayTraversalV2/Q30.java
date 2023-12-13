package Tap.Tai.Q5_ArrayTraversalV2;

/*
Index of Smallest Element
        Find the index of the smallest element in an array.

        Input Format
        The first line contains an integer 'n' (1 <= n <= 100), representing the size of the array.

        The second line contains 'n' space-separated integers, representing the elements of the array.

        Output Format
        Print the index of the smallest element in the array.

        Sample Inputs & Outputs
        Sample Input 1
        5
        10 7 15 4 8
        Sample Output 1
        3
        Sample Input 2
        4
        1 8 3 9
        Sample Output 2
        0
*/


import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = indexSmallestElement(arr);
        System.out.println(result);
    }

    static int indexSmallestElement(int arr[]){
        int min = arr[0], index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
