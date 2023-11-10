package Tap.Tai.Q6ArrayPairs;

/*
Pairs with Second value Smaller than First Value
sample input :-
5
3 1 5 4 2
sample output:-
3 1
3 2
5 4
5 2
4 2

sample input :-
3
4 2 3
sample output:-
4 2
4 3

*/

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        smallNumer(arr);
    }

    static  void  smallNumer(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    System.out.println(arr[i] + " "+ arr[j]);
                }
            }
        }
    }

}
