package Tap.RunningClass.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class MyCompare3 implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
//        return i1.compareTo(i2) * -1;
        return i2 - i1;
    }
}

public class Q7 {
    public static void main(String[] args) {
        MyCompare3 compare3 = new MyCompare3();
//        TreeSet<Integer> set = new TreeSet<Integer>(compare3);
        ArrayList<Integer> set = new ArrayList<>();
        set.add(100);
        set.add(150);
        set.add(125);
        set.add(35);
        set.add(50);
        set.add(750);
        System.out.println(set);
        Collections.sort(set);
        System.out.println(set);
        Collections.sort(set, compare3);
        System.out.println(set);


    }
}
