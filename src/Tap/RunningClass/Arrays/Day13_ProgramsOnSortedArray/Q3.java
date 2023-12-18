package Tap.RunningClass.Arrays.Day13_ProgramsOnSortedArray;

/*
   Given a sorted array of Integer Values print the unique elements.

   input:-
   8
   2 2 2 3 4 4 4 23

   output:-
  3 23

* */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        uniqueElements(arr);
    }

    static void uniqueElements(int arr[]){
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]){
                count++;
            }else {
                if (count == 1){
                    System.out.print(arr[i] + " ");
                }
                count = 1;
            }
        }
        System.out.print(arr[arr.length - 1]);
    }
}
