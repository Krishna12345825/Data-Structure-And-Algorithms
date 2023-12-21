package Tap.RunningClass.collections.Map_Set;

import java.util.IdentityHashMap;

public class Q2 {
    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        String s1 = new String("Centurion");
        String s2 = new String("Academy");
        System.out.println(s1 == s2);

        map.put(s1, 100);
        map.put(s2, 200);
        System.out.println(map);
    }
}
