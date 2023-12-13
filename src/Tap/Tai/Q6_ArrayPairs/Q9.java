package Tap.Tai.Q6_ArrayPairs;

import java.util.Scanner;
/*

Odd Pairs
Sample input :-
6
2 4 6 3 8 9
sample output:-
3 9
Sample input :-
4
1 2 3 4

sample output:-
1 3
*/


public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        oddPairs(arr);
    }


    static void oddPairs(int arr[]){
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j<arr.length; j++) {
                if (arr[i]%2!=0  &&  arr[j]%2!=0){
                    System.out.println(arr[i] +" "+ arr[j]);
                }
            }
        }
    }
}
