package Tap.Tai.ArrayTraversalV2;

import java.util.Scanner;

/*
Print Elements in an Array from Start to Middle
        Print elements of the array from the starting to the middle.

        Input Format
        The function should prompt the user to enter the size of the array and the array elements.

        Output Format
        Print the array elements on a single line, each element separated by a space.

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
        10 20 30
   */
public class Q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printElements(arr);

    }
    static void printElements(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
                System.out.print(arr[i]+" ");
        }
    }
}
