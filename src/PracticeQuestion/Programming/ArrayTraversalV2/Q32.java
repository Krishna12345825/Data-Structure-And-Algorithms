package PracticeQuestion.Programming.ArrayTraversalV2;

/*
Missing Element
        Find the missing element in an unsorted array without using sorting.

        Input Format
        The first line consists of the size of the array, followed by a line containing space-separated integers representing the elements of the array.

        Output Format
        Output a single integer representing the missing element.

        Sample Inputs & Outputs
        Sample Input 1
        6
        1 4 2 7 5 3
        Sample Output 1
        6
        Sample Input 2
        10
        1 2 3 6 8 7 4 5 10 11
        Sample Output 2
        9
        Constraints
        The length of the array will be positive and will not exceed 1000.

        Each integer in the array will be between 1 and 10^9 (inclusive).

        There will be exactly one element missing from the array.
*/


import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int ressult = missingElement(arr);
        System.out.println(ressult);

    }
    static int missingElement(int arr[]){
        int n = arr.length;
        int naturalNumber = (n + 1) * (n + 2) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        return naturalNumber - sum;
    }

}
