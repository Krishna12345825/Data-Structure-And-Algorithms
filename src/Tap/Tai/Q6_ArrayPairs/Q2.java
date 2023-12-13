package Tap.Tai.Q6_ArrayPairs;

import java.util.Scanner;

/*
Minimum Pair Sum
sample input 1:
6
5 9 2 8 3 7
sample output 1:
5

sample input 2:
7
10 5 8 2 6 1 4
sample output 2:
3

*/

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int result  = minimumPairSum(arr);
        System.out.println(result);
    }

    static int minimumPairSum(int []arr){
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }
        return min + secondMin;
    }

}
