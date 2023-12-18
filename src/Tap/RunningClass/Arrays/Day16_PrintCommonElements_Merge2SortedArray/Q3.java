package Tap.RunningClass.Arrays.Day16_PrintCommonElements_Merge2SortedArray;


/*
Given 2 sorted arrays merge these arrays such that the resultant array is sorted
input:-

arr1 :-
5
3 5 7 9 13
arr2 :-
8
1 2 3 4 9 15 17 19

output:-
result:- 1 2 3 3 4 5 7 9 9 13 15 17 19

*/


import java.util.Scanner;

public class Q3 {
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
        int res[] = mergearrays(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static int[] mergearrays(int arr1[], int arr2[]){
        int result[] = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr2[j] <= arr1[i]){
                result[k] = arr2[j];
                j++;
                k++;
            }else if (arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
                k++;
            }
        }
        while (i < arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }
}
