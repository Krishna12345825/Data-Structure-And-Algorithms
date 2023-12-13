package Tap.Tai.Q8_MultipleArrays_completed;

import java.util.Scanner;


/*Repeated Elements in two Sorted Arrays
input1:-
6
1 2 3 4 5 6
5
6 5 4 3 2
output1:-
2 3 4 5 6

input2:-
8
1 3 5 7 9 11 13 15
6
15 11 9 7 5 3
output2:-
3 5 7 9 11 15
*/


public class Q6 {
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
        int i = 0;
        int j = arr2.length-1;

        while (i < arr1.length && j >= 0){
           if (arr1[i] == arr2[j]){
               System.out.print(arr1[i]+" ");
               i++;
               j--;
           } else if (arr1[i] < arr2[j]) {
               i++;
           }else {
               j--;
           }
        }
    }
}
