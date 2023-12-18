package Tap.RunningClass.Arrays.Day16_PrintCommonElements_Merge2SortedArray;


/*
Given 2 sorted array print the element which are repeated.
input:-
arr1:- 3 5 6 8 9
arr2:- 2 3 4 6 7 8 8

output:-
3 6 8


*/


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        repeatedElements(arr1, arr2);

    }

    static void repeatedElements(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            }else {
                i++;
            }
        }
    }


}
