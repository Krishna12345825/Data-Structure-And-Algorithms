package Tap.RunningClass.collections.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Q1 {

    public static void main(String[] args) {

        HashMap map = new HashMap<>();
        map.put("india", 900);
        map.put("china", 9700);
        map.put("usa", 8900);
        map.put("uk", 8769);
        map.put(true, false);
        map.put(3.14, new ArrayList<>());
        System.out.println(map);
    }
}
