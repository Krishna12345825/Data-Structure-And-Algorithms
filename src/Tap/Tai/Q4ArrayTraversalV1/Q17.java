package Tap.Tai.Q4ArrayTraversalV1;

/*
Product of Array Elements from Middle Index to End
        Calculate and print the product of elements of the array from the middle to the end.

        Input Format
        The function should prompt the user to enter the size of the array and the array elements.

        Output Format
        Print a single integer, representing the product of the elements.

        Sample Inputs & Outputs
        Sample Input 1
        2
        7 8
        Sample Output 1
        8
        Sample Input 2
        7
        10 20 30 40 50 60 70
        Sample Output 2
        8400000
        Constraints
        The size of the array is a positive integer.
        The elements of the array are integers.
*/


import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = productElementsMiddleIndexToEnd(arr);
        System.out.println(sum);
    }

    static int productElementsMiddleIndexToEnd(int arr[]){
        int product = 1;
        for (int i = arr.length/2; i < arr.length; i++) {
            product = product * arr[i];
        }
        return product;
    }
}
