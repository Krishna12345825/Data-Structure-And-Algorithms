package lectures.hash.hashSet.code;

import java.util.HashSet;
import java.util.Iterator;

public class Q1HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();


        // add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(3);


        //  size
        System.out.println("Size of set is  : " + set.size());
        System.out.println(set);

        System.out.println("....................Second Line......................................");

        // searching
        if (set.contains(1)) {
            System.out.println("Present");
        }
        if (!set.contains(7)) {
            System.out.println("absent");
        }

        System.out.println("....................Third  Line......................................");


        // delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Absent");
        }

        System.out.println("....................Fourth Line......................................");


        // print all elements
        System.out.println(set);

        System.out.println("....................Fifth Line......................................");


        // Iteration - HashSet does not have an order
        set.add(0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + ", ");
        }


        System.out.println("....................End Line......................................");

    }
}
