package PracticeQuestion.Programming.ArrayTraversalV2;

/*
Print Repeating Elements
        Print the elements that occur more than once in a sorted array.

        Input Format
        The input consists of two lines:

        The first line contains a single integer N, representing the size of the array (1 ≤ N ≤ 10^5).

        The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

        Output Format
        Print the repeating elements in a single line, separated by a space, or -1 if no element is repeating.

        Sample Inputs & Outputs
        Sample Input 1
        8
        1 2 3 3 4 4 4 5
        Sample Output 1
        3 4
        Sample Input 2
        6
        1 2 3 4 5 6
        Sample Output 2
        -1
   */

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result1 = findSmallestRepeatingElementDescending(arr);
        int result2 = findLargestRepeatingElementDescending(arr);
           if (result1 < result2){
               System.out.println(arr[result1]+" "+arr[result2]);
           }else {
               System.out.println("-1");
           }

    }
    static int findSmallestRepeatingElementDescending(int arr[]){
        int smallestRepeatingElement = -1;
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] == arr[i-1]){
                smallestRepeatingElement = arr[i];
                break;
            }
        }
        return smallestRepeatingElement;
    }

    static int findLargestRepeatingElementDescending(int arr[]){
        int smallestRepeatingElement = -1;
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] == arr[i-1]){
                smallestRepeatingElement = arr[i];
            }
        }
        return smallestRepeatingElement;
    }

}
