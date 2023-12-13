package Tap.Tai.Q8_MultipleArrays;

import java.util.Scanner;


/*
Non - Repeated Elements
input1:-
5
1 2 3 4 5
6
2 4 6 8 10 12
output1:-
1 3 5 6 8 10 12

input2:-
4
2 4 6 8
5
4 6 8 10 12
output2:-
2 10 12
*/


public class Q8 {
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
        nonRepeatedElements(arr1, arr2);
    }

    static void nonRepeatedElements(int arr1[], int arr2[]){
        int i = 0;
        while (i < arr1.length){
            boolean isRepeated = false;
            for (int k = 0; k < arr2.length; k++) {
               if (arr1[i] == arr2[k]){
                   isRepeated = true;
                   break;
               }
            }
            if (!isRepeated){
                System.out.print(arr1[i]+" ");
            }
            i++;
        }

        i = 0;
        while (i < arr2.length){
            boolean isRepeated = false;
            for (int k = 0; k < arr1.length; k++) {
                if (arr1[k] == arr2[i]){
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated){
                System.out.print(arr2[i]+" ");
            }
            i++;
        }


    }
}
