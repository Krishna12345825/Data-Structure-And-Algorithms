package Tap.RunningClass.collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
input:-
        mississippi
*/


public class Q9 {

    static String rearrange(String s){
//        HashMap<Character, Integer> map = new HashMap<>();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                Integer value = map.get(ch);
                map.put(ch, value + 1);
            }else {
                map.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        String t = "";
        for (Map.Entry<Character, Integer> e : entries){
            if (e.getValue() > 3){
                t = t + e.getKey();
            }
        }
        return t;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = rearrange(s);
        System.out.println(result);
    }
}

