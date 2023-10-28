package PracticeQuestion.Programming.ArrayTraversalV2;

/*
Sum Positive Negative
        Write a program to find the sum of positive elements and negative elements separately in an array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        First line print sum of positive elements in an array. Second line print sum of negative elements in an array.

        Sample Inputs & Outputs
        Sample Input 1
        6
        1 -4 -6 3 10 -20
        Sample Output 1
        14
        -30
        Sample Input 2
        5
        5 -10 -15 20 25
        Sample Output 2
        50
        -25
*/


import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sumPositiveNegative(arr);
    }

    static void sumPositiveNegative(int arr[]){
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                positiveSum +=arr[i];
            } else if (arr[i] < 0) {
                negativeSum +=arr[i];
            }
        }
        System.out.println(positiveSum);
        System.out.println(negativeSum);

    }


}
