package Tap.Tai.Q7_SortedArrays;

import java.util.Scanner;


/*
First Element Not in Sorting order
input1:-
5
1 2 3 4 5
5
3 4 5 6 7
output:-
3 5

input:-
4
2 4 6 8
4
1 3 5 7
output:-
No Commom Odd Elements Dound.
*/


public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int n1 = scanner.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        unsortedElements(arr, arr1);

    }


    static void unsortedElements(int arr[], int arr2[]){
        int i = 0;
        int j = 0;
        boolean found = false;
        while (i < arr.length && j < arr2.length){
            if (arr[i]%2!=0 && arr2[j]%2!=0){
                System.out.print(arr2[j]+" ");
                found = true;
                i++;
                j++;
            } else if (arr[i] < arr2[j]) {
                i++;
            }else {
                j++;
            }
        }
        if (!found){
            System.out.print("No Commom Odd Elements Dound.");
        }

    }

}
