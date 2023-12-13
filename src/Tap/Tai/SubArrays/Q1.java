package Tap.Tai.SubArrays;

import java.util.Scanner;


/*
input1:-
3
1 2 3
output:-
1
2
3
1 2
2 3
1 2 3

input2:-
4
10 20 30 40
output2:-
10
20
30
40
10 20
20 30
30 40
10 20 30
20 30 40
10 20 30 40

*/





public class Q1 {

    static void allPosibleSubArray(int []arr){
        for (int size = 0; size <= arr.length; size++) {
            for (int i = 0; i < arr.length - size; i++) {
                for (int j = i; j <= i + size; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }


    static void allPosibleSubArray1(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        allPosibleSubArray(arr);
        System.out.println();
        allPosibleSubArray1(arr);
    }
}
