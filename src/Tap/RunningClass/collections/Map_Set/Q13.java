package Tap.RunningClass.collections.Map_Set;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Q13 {
    public static void main(String[] args) {

    }

    static void groupOfPairs(int arr[]){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                Integer value = map.get(arr[i]);
                map.put(arr[i], value + 1);
            }else {
                map.put(arr[i], 1);
            }

        }

       Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        int sum = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> e : entries){
            if (e.getKey() > 0){

            }
        }
    }
}
