package Tap.RunningClass.Arrays.Day19_RearrangeTheArray;

import java.util.Scanner;



/*

Given an Array of positive Integer values and 0. Write a program to put all the 0 to the ending of the array

intput:-
10
3 7 0 4 0 6 0 8 0 3

output:-
3 7 4 6 8 3 0 0 0 0

*/


public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int res[] = rearrange(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static int[] rearrange(int arr[]) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                i++;
            } else {
                arr[j] = arr[i];
                i++;
                j++;
            }
        }
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
        return arr;
    }
}
