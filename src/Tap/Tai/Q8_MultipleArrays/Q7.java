package Tap.Tai.Q8_MultipleArrays;

import java.util.Scanner;


/*Repeated Elements in two Sorted Arrays
input1:-
6
9 8 7 6 5 4
5
4 5 6 7 8
output1:-
4 5 6 7 8

input2:-
7
10 8 6 4 2 2 0
6
0 1 2 3 4 5
output2:-
0 2 4
*/


public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        sortedArray(arr1, arr2);
    }

    static void sortedArray(int arr1[], int arr2[]){
        int i = arr1.length-1;
        int j = 0;

        while (i >= 0 && j < arr2.length){
           if (arr1[i] == arr2[j]){
               System.out.print(arr1[i]+" ");
               i--;
               j++;
           } else if (arr1[i] < arr2[j]) {
               i--;
           }else {
               j++;
           }
        }
    }
}
