package PracticeQuestion.Programming.ArrayTraversalV1;

/*
Print Product of Elements in an Array
        Calculate and print the product of all elements in the array.

        Input Format
        The function should prompt the user to enter the size of the array and the array elements.

        Output Format
        Print a single integer, representing the product of all elements in the array.

        Sample Inputs & Outputs
        Sample Input 1
        3
        0 1 2
        Sample Output 1
        0
        Sample Input 2
        2
        -10 10
        Sample Output 2
        -100
*/

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = productElements(arr);
        System.out.println(result);
    }

    static int productElements(int arr[]){
        int product =1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        return product;
    }
}
