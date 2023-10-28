package PracticeQuestion.Programming.ArrayTraversalV2;

/*
Count Largest Element Occurrences
        Count the number of occurrences of the largest element in an ascending sorted array.

        Input Format
        The input consists of two lines:

        The first line contains a single integer N, representing the size of the array (1 ≤ N ≤ 10^5).

        The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

        Output Format
        Print a single integer, the count of occurrences of the largest element in the array.

        Sample Inputs & Outputs
        Sample Input 1
        8
        1 2 3 3 4 4 4 5
        Sample Output 1
        1
        Sample Input 2
        6
        1 2 3 4 5 6
        Sample Output 2
        1
*/


import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = countLargestElement(arr);
        System.out.println(result);

    }
    static int countLargestElement(int arr[]){
        int max = arr[0];
        int count = 0;
        for (int i = 1; i <arr.length; i++) {
               if (arr[i] > max){
                   max = arr[i];
               }

          /*  if(arr[i] >max){
                max = arr[i];
                count = 1;
            }else if(arr[i] == max){
                count++;
            }*/
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max){
                count++;
            }
        }
        return count;
    }
}
