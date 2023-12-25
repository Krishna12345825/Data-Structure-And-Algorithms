package Tap.RunningClass.collections.Map_Set;

import java.util.HashSet;
import java.util.Scanner;


/*

input:-
12
3 4 3 2 1 4 1 3 2 1 1 3
output:-
3
* */

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        groupSum(arr);
    }

    static void groupSum(int arr[]){
        int groupCount= 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])){
                groupCount++;
                set.clear();
            }else {
                set.add(arr[i]);
            }
        }

        for (int a : set){
            System.out.println(arr[a]);
        }


    }
}
