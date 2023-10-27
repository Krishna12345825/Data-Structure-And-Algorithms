package PracticeQuestion.Programming.ArrayTraversalV1;

/*
Product of Array Elements from Start to Middle
        Calculate and print the product of elements of the array from the starting to the middle.

        Input Format
        The function should prompt the user to enter the size of the array and the array elements.

        Output Format
        Print a single integer, representing the product of the elements.

        Sample Inputs & Outputs
        Sample Input 1
        2
        7 8
        Sample Output 1
        7
        Sample Input 2
        7
        10 20 30 40 50 60 70
        Sample Output 2
        6000
        Constraints
        The size of the array is a positive integer.
        The elements of the array are integers.
*/


import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
       int sum = productElementStartToMiddle(arr);
        System.out.println(sum);
    }

    static int productElementStartToMiddle(int arr[]){
        int product = 1;
        for (int i = 0; i < arr.length/2; i++) {
            product = product * arr[i];
        }
        return product;
    }
}
