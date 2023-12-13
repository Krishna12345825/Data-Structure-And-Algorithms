package Tap.Tai.Q7_SortedArrays;

import java.util.Scanner;


/*
First Element Not in Sorting order
input1:-
5
1 2 3 4 5
output1:-
-1

input:-
7
1 2 3 6 4 5 7
output:-
4
*/


public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int res = unsortedElements(arr);
        System.out.println(res);
    }


    static int unsortedElements(int arr[]){
        int unsorted = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]){
                unsorted = arr[i+1];
            }
        }
        return unsorted;
    }

}
