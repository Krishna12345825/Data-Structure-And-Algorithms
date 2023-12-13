package Tap.Tai.Q6_ArrayPairs;

import java.util.Scanner;
/*

Pairs with Sum Less than k
Sample input :-
6
2 4 6 3 8 9
10
sample output:-
2 4
2 6
2 3
4 3
6 3
Sample input :-
5
1 2 3 4 5
7
sample output:-
1 2
1 3
1 4
1 5
2 3
2 4
*/


public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        pairsWithSumK(arr, k);
    }


    static void pairsWithSumK(int arr[], int k){
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j<arr.length; j++) {
               if (arr[i] + arr[j] < k){
                   System.out.println(arr[i]+" "+ arr[j]);
               }
            }
        }
    }
}
