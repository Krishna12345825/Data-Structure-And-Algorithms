package PracticeQuestion.Programming.ArrayTraversalV2;

/*
Print Float Elements
        Write a program that creates an array to store float numbers and prints all the float elements by taking inputs individually using a loop.

        Input Format
        The first line contains an integer value N, the number of elements.

        The second line contains N space separated decimal values.

        Output Format
        Print each float element on a new line.

        Sample Inputs & Outputs
        Sample Input 1
        3
        2.4 4.7 6.1
        Sample Output 1
        2.4
        4.7
        6.1
        Sample Input 2
        2
        8.9 9.2
        Sample Output 2
        8.9
        9.2
        Constraints
        1 <= N <= 1000, where N is the number of float numbers.

*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float arr[] = new float[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextFloat();
        }
       printFloatElements(arr);
    }

    static void printFloatElements(float arr[]){
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
        }
    }
}
