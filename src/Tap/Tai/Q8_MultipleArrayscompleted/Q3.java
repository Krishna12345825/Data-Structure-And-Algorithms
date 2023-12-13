package Tap.Tai.Q8_MultipleArrayscompleted;

/*

Common Repeating Odd Elements in Sorted Arrays
input1:-
5
1 2 3 4 5
5
3 4 5 6 7
output1:-
1 5


input2:-
4
2 4 6 8
4
1 3 5 7

output2:-
No commom odd elements found.

*/


import java.util.Scanner;

public class Q3 {
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
        commonRepeatingOddElements(arr1, arr2);
    }

    static void commonRepeatingOddElements(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        boolean isTrue = false;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i]%2!=0 && arr2[j]%2!=0){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
                isTrue = true;
            } else if (arr1[i] < arr2[j]) {
                i++;
            }else {
                j++;
            }
        }
        if (!isTrue){
            System.out.print("No commom odd elements found.");
        }
    }
}
