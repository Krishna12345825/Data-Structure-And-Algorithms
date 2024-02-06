package Tap.Tai.Q8_MultipleArrays_completed;


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


import java.util.*;

public class Q4 {
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
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int arr : arr1){
            set1.add(arr);
        }
        for (int arr : arr2){
            set2.add(arr);
        }

        Set<Integer> sets = new HashSet<>(set1);
        sets.retainAll(set2);

        int []resultArray = sets.stream().filter(arr -> arr %2 ==0).mapToInt(Integer :: intValue).toArray();
        Arrays.sort(resultArray);

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
            if (i < resultArray.length - 1){
                System.out.print(" ");
            }
        }



    }


}
