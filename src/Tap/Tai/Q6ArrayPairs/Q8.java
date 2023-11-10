package Tap.Tai.Q6ArrayPairs;

import java.util.Scanner;
/*

Even Pairs
Sample input :-
6
2 4 6 3 8 9
sample output:-
2 4
2 6
2 8
4 6
4 8
6 8
Sample input :-
4
1 2 3 4

sample output:-
2 4
*/



public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        evenPairs(arr);
    }


    static void evenPairs(int arr[]){
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j<arr.length; j++) {
                if (arr[i]%2==0  &&  arr[j]%2==0){
                    System.out.println(arr[i] +" "+ arr[j]);
                }
            }
        }
    }
}
