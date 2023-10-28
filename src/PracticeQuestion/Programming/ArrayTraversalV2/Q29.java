package PracticeQuestion.Programming.ArrayTraversalV2;

/*
Largest Repeating Element
        Find the largest repeating element in a sorted array. If there are multiple elements that appear the maximum number of times, return the last occurrence among them.

        Input Format
        The first line contains an integer 'n' , representing the size of the array.

        The second line contains 'n' space-separated integers, representing the elements of the array in ascending order.

        Output Format
        Print the largest repeating element in the array.

        Sample Inputs & Outputs
        Sample Input 1
        6
        1 2 3 3 4 5
        Sample Output 1
        3
        Sample Input 2
        7
        1 2 3 5 5 6 7
        Sample Output 2
        5
*/


import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result  = largestRepeatingElements(arr);
        System.out.println(result);
    }

    static int largestRepeatingElements(int arr[]){
        int largestRepeatingElements = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                largestRepeatingElements = arr[i];
            }
        }
        return largestRepeatingElements;
    }
}
