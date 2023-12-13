package Tap.Tai.Q9_SubArrays_Completed;


/*
Longest SubArray with Sum Equals to K

input1:-
7
8
3 4 7 2 -3 1 4 2
output1:-
7 2 -3 1

input2:-
10
6
1 2 3 4 5 6

output2:-
1 2 3 4
*/


import java.util.Scanner;

public class Q3 {


    static void longestSubArrayWithSumK(int k, int arr[]){
        int maxLength = 0;
        int startingIndex = -1;
        int endingIndex = -1;
        for (int size = 0; size < arr.length; size++) {
            for (int i = 0; i < arr.length - size; i++) {
                int sum = 0;
                for (int j = i; j <= i + size; j++) {
                    sum = sum + arr[j];
                }
                if (sum == k && size > maxLength){
                    maxLength = size;
                    startingIndex = i;
                    endingIndex = i + size;
                }
            }
        }

        if (maxLength > 0){
            for (int i = startingIndex; i <= endingIndex; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }else {
            System.out.println("No SubArray found");
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
        longestSubArrayWithSumK(k, arr);
    }
}
