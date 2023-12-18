package Tap.RunningClass.Arrays.Day13_ProgramsOnSortedArray;

import java.util.Scanner;


/*
   Given an array of Integer Values in the sorted array count the number oof unique elements in the array

   input:-
   8
   2 2 2 3 4 4 4 23

   output:-
   2

* */

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        uniqueElements(arr);
    }

    static void uniqueElements(int arr[]) {
        int count = 1;
        int uniqueCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    uniqueCount++;
                }
                count = 1;
            }
        }
        if (count == 1) {
            uniqueCount++;
        }
        System.out.println(uniqueCount);
    }
}
