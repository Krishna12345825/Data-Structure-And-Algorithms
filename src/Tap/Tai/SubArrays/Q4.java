package Tap.Tai.SubArrays;

import java.util.Scanner;

public class Q4 {

    /*

Smallest SubArray with Sum Equals to K
input1:
5
6
2 3 1 4 2 5
output1:-
5

input2:-
15
5
10 2 4 8 7
output2:-
8 7



 */


    static void smallestSubArraySumK(int k, int arr[]){
        int startingIndex = -1;
        int endingIndex = -1;
        int minLength =Integer.MAX_VALUE;
        for (int size = 0; size < arr.length; size++) {
            for (int i = 0; i < arr.length - size; i++) {
                int sum = 0;
                for (int j = i; j <= i + size; j++) {
                    sum = sum + arr[j];
                }
                if (sum == k && size < minLength){
                    minLength = size + 1;
                    startingIndex = i;
                    endingIndex = i + size;
                }
            }
        }
        if (minLength  != Integer.MAX_VALUE){
            for (int i = startingIndex; i <= endingIndex ; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }else {
            System.out.println("No found SubArray");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        smallestSubArraySumK(k, arr);
    }
}
