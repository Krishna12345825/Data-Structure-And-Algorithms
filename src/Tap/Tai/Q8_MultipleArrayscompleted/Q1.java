package Tap.Tai.Q8_MultipleArrayscompleted;



/*
Array Merger
input1:-
3
1 2 3
4
4 5 6 7
output1:-
Merged array: 1 2 3 4 5 6 7

input2:-
4
1 2 3 4
5
3 4 5 6 7
output2:-
Merged array: 1 2 3 4 5 6 7

*/


import java.util.Scanner;

public class Q1 {


    static int[] mergerArray(int arr1[], int arr2[]){
        int result[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length){
            result[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length){
            result[k] = arr2[j];
            k++;
            j++;
        }
        System.out.print("Merged array: ");
        return result;
    }



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
        int arr3[] = mergerArray(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }

    }
}
