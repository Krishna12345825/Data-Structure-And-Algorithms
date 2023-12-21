package Tap.RunningClass.collections.Map_Set;

import java.util.Scanner;
import java.util.TreeSet;

public class Q6 {

    static void removeURLs(String s){
        String []arr = s.split(",");
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i].trim());
        }

        for (String str : set){
            System.out.println(str);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        removeURLs(s);
    }
}

/*
input:
        www.fb.com , www.cutm.com  , www.insta.com ,         www.fb.com ,  www.cutm.com ,  www.insta.com , www.fb.com
        */
