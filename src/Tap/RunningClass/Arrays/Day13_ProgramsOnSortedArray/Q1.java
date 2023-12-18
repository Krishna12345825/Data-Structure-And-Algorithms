package Tap.RunningClass.Arrays.Day13_ProgramsOnSortedArray;


/*
   Given a sorted array of Integer Values, find the occurrences of each element in the array
   input:-
   8
   2 2 2 3 4 4 4 23

   output:-
   2 - 3
   3 - 1
   4 - 3
   23 - 1

* */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        countOcuurances(arr);
    }

    static void countOcuurances(int arr[]){
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]){
                count++;
            }else {
                System.out.println(arr[i] + " - " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " - " + count);
    }
}
