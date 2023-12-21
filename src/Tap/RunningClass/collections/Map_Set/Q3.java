package Tap.RunningClass.collections.Map_Set;

import java.util.WeakHashMap;

public class Q3 {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        String s1 = "India";
        String s2 = s1;
        map.put(s2, 100);
        s1 = null;
        s2 = null;
        System.gc();
        System.out.println(map);
    }
}
