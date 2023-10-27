package PracticeQuestion.Programming.ArrayTraversalV1;

/*

Average of Array
        Easy
        Write a program to find the average of all elements present in an array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print float value of average of all elements in an array. [it has to print 2 decimal points]

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        4.80
        Sample Input 2
        5
        5 -10 -15 20 -25
        Sample Output 2
        -5.00
*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = averageNumber(arr);
//        float result1 = (float) result / n;
//        System.out.println("%.2f "+result1);
        System.out.println(result);
    }

    static int averageNumber(int []arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
      int result =  sum / arr.length;
        return result;
    }


}
