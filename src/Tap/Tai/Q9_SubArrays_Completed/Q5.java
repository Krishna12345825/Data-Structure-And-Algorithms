package Tap.Tai.Q9_SubArrays_Completed;


/*
All SubArrays of Size K
input1:-
3
5
1 2 3 4 5
output1:-
1 2 3
2 3 4
3 4 5

input2:-
2
4
10 20 30 40
output2:-
10 20
20 30
30 40

*/

import java.util.Scanner;

public class Q5 {

    static void allSubArraysSizeK(int size, int arr[]){
        for (int i = 0; i <= arr.length - size; i++) {
            for (int j = i; j < i + size; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        allSubArraysSizeK(size, arr);
    }
}
