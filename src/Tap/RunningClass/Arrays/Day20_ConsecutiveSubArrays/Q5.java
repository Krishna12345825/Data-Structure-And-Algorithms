package Tap.RunningClass.Arrays.Day20_ConsecutiveSubArrays;


/*
Given an array of size n, Print the Largest subArray that is consecutive
input:-
10
5 12 13 14 9 2 3 4 5 6

output:-
2 3 4 5 6

*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        largestConsecutiveSubArray(arr);
    }

    static void largestConsecutiveSubArray(int arr[]){
        int count = 1;
        int max = 0;
        int startingIndex = 0;
        int endingIndex = 0;
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i+1] - arr[i] == 1){
                count++;
            }else {
                if (count > max){
                    max = count;
                    endingIndex = i;
                }
                count = 1;
            }
        }
        if (count > max){
            max = count;
            endingIndex = arr.length-1;
        }
        startingIndex = endingIndex - max + 1;
        for (int i = startingIndex; i <= endingIndex; i++){
            System.out.print(arr[i] + " ");
        }

    }


}
