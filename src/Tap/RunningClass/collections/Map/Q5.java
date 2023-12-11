package Tap.RunningClass.collections.Map;

import java.util.Scanner;
import java.util.TreeSet;

public class Q5 {

    static void removeDuplicates(int arr[]){
        TreeSet<Integer>  set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int ar : set){
            System.out.println(ar);
        }
    }

    public static void main(String[] args) {
       int arr[] = {10, 2,7,3,5,7,2,3};
       removeDuplicates(arr);

    }
}
