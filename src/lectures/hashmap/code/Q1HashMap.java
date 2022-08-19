package lectures.hashmap.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q1HashMap {
    public static void main(String[] args) {
        // creating
        HashMap<String, Integer> map = new HashMap<>();
        // inserting
        map.put("India", 120);
        map.put("Us", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);


        System.out.println("....................Second Line......................................");

        // searching
        if (map.containsKey("Indonesia")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }


        System.out.println("....................Third Line......................................");


        System.out.println(map.get("China"));  // key exists
        System.out.println(map.get("Indonesia"));  // key doesn't exist
        System.out.println(map.get("India"));   // key exists


        System.out.println("....................Fourth Line......................................");


        // Iterations (1)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        System.out.println("....................Fifth Line......................................");


        // Iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }


        System.out.println("....................End Line......................................");

    }
}
