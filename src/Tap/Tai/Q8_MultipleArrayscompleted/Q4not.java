package Tap.Tai.Q8_MultipleArrayscompleted;


/*
Repeated Even Elements
input1:-
7
2 4 5 6 8 10 12
6
4 6 6 8 10 12
output1:-
4 6 8 10 12

input2:-
6
2 4 6 8 10 12
4
3 6 8 12
output2:-
6 8 12


*/


import java.util.Scanner;

public class Q4not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int arr2[] = new int[n2];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = scanner.nextInt();
        }
        repeatingEvenElements(arr1, arr2);

    }

    static void repeatingEvenElements(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i]%2==0 && arr2[j]%2==0){
                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            }else {
                j++;
            }
        }
    }


}
