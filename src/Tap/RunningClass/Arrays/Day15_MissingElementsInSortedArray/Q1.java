package Tap.RunningClass.Arrays.Day15_MissingElementsInSortedArray;

import java.util.Scanner;
/*
Missing Elements
input:-
10
3 4 5 6 7 9 10 11 12 13
output:-
8

*/


public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int res = findingMissing(arr);
        System.out.println(res);
    }

    static int findingMissing(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] - arr[i] != 1){
                return arr[i] + 1;
            }
        }
        return arr[arr.length - 1] + 1;
    }
}
