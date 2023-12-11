package Tap.RunningClass.collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
input:-
        fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering

        output:-
        leads
        to
 */


public class Q10 {

    static void rearrange(String s){
//        HashMap<Character, Integer> map = new HashMap<>();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String []arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])){
                Integer value = map.get(arr[i]);
                map.put(arr[i], value + 1);
            }else {
                map.put(arr[i], 1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> e : entries){
            if (e.getValue() > 3){
                System.out.println(e.getKey());
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
         rearrange(s);

    }
}

