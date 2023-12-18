package Tap.RunningClass.Arrays.Day16_PrintCommonElements_Merge2SortedArray;



/*

input:
10
1 3 5 9 2 8 10 4 11 6
output:-

7
*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans  = missingNumber(arr);
        System.out.println(ans);
    }

    static int missingNumber(int arr[]){
        int n = arr.length+1;
        int sum1 = n * (n + 1)/2;
        int sum2 = 0;
        for (int i = 0; i<arr.length; i++){
            sum2 = sum2 + arr[i];
        }
        return sum1 - sum2;
    }
}
