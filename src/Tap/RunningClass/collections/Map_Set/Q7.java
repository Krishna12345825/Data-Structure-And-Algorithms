package Tap.RunningClass.collections.Map_Set;

import java.util.*;

/*
input:-
        mississippi
*/


public class Q7 {

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
            t = t + e.getKey() + e.getValue();
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

