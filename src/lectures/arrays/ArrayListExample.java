package lectures.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(12);
        list.add(34);
        list.add(56);
        list.add(789);
        list.add(4567);
        System.out.println(list.contains(765432));
        System.out.println(list);
        list.set(0, 99);

        list.remove(2);
        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);

    }
}

