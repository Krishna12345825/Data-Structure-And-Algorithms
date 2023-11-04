package Tap.Tai.ArrayTraversalV2;

/*
Second-Largest Number

        Find the second-largest number in a given array of integers. Where second-largest number must be different from first largest number.

        Input Format
        The first line contains a single integer, N, representing the size of the array.

        The second line contains N space-separated integers, representing the elements of the array.

        Output Format
        Print the second-largest number in the array.

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        6
        Sample Input 2
        8
        3 8 2 10 5 9 7 1
        Sample Output 2
        9
*/


import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int  result = secondLargestElement(arr);
        System.out.println(result);
    }

    static int secondLargestElement(int arr[]){
        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }
}
