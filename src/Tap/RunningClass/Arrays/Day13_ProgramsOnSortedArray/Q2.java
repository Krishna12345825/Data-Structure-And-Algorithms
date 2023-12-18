package Tap.RunningClass.Arrays.Day13_ProgramsOnSortedArray;

/*
   Given a sorted array of Integer Values print all the elements of the array without repeating.

   input:-
   8
   2 2 2 3 4 4 4 23

   output:-
  2 3 4 23

* */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        withoutRepeatingElements(arr);
    }

    static void withoutRepeatingElements(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print(arr[arr.length - 1]);
    }

}
