package Tap.RunningClass.collections.Map;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {

//        HashMap map = new HashMap<>();
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();


        map.put("india", 900);
        map.put("china", 9700);
        map.put("usa", 8900);
        map.put("uk", 8769);
        map.put("india", 900);
        map.put("usa", 8900);

//        map.put(true, false);
//        map.put(3.14, new ArrayList<>());
//        System.out.println(map);



/*      Set<Map.Entry<String, Integer>>  entrys = map.entrySet();
      for (Map.Entry<String, Integer> e : entrys){
//          System.out.println(e);
          System.out.println(e.getKey() + " : " + e.getValue());
      }*/


        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }


    }
}
