package Tap.RunningClass.Arrays.Day18_ProgramOnSubArrays;

import java.util.Scanner;



/*

Given an array of size N, print all the subarrays of given size whose sum is equal to k
input:-
9
5 1 2 4 9 3 1 3 3

output:-

5
1
2
4
9
3
1
3
3
5 1
1 2
2 4
4 9
9 3
3 1
1 3
3 3
5 1 2
1 2 4
2 4 9
4 9 3
9 3 1
3 1 3
1 3 3
5 1 2 4
1 2 4 9
2 4 9 3
4 9 3 1
9 3 1 3
3 1 3 3
5 1 2 4 9
1 2 4 9 3
2 4 9 3 1
4 9 3 1 3
9 3 1 3 3
5 1 2 4 9 3
1 2 4 9 3 1
2 4 9 3 1 3
4 9 3 1 3 3
5 1 2 4 9 3 1
1 2 4 9 3 1 3
2 4 9 3 1 3 3
5 1 2 4 9 3 1 3
1 2 4 9 3 1 3 3


*/


public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        allSubArray(arr);
    }

    static void allSubArray(int arr[]){
        for (int size = 0; size < arr.length; size++) {
            for (int i = 0; i <= arr.length - size; i++) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }

}
