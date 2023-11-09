package Tap.Tai.Q5ArrayTraversalV2;

/*
Print Odd Index Array Elements
        Print elements of the array located at odd indices.

        Input Format
        The function should prompt the user to enter the size of the array and the array elements.

        Output Format
        Print the odd-indexed array elements on a single line, each element separated by a space.

        Sample Inputs & Outputs
        Sample Input 1
        2
        7 8
        Sample Output 1
        8
        Sample Input 2
        8
        10 20 30 40 50 60 70 80
        Sample Output 2
        20 40 60 80
*/


import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        oddIndexElement(arr);

    }
    static void oddIndexElement(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
