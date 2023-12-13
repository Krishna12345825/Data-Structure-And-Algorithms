package Tap.Tai.Q6_ArrayPairs;

import java.util.Scanner;
/*

Counting Pairs
Sample input :-
5
1 2 3 4 5

sample output:-
10
Sample input :-
3
-1 0 1
sample output:-
3
*/


public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int res =  countPairs(arr);
        System.out.println(res);
    }


    static int countPairs(int arr[]){
        int count  = 0;
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j<arr.length; j++) {
                count++;
            }
        }
        return count;
    }
}
