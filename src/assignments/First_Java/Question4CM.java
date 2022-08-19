package assignments.First_Java;

import java.util.Scanner;

public class Question4CM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two  Number");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int lcm;
        for (lcm = first > second ? first : second; lcm <= first * second; lcm = lcm + (first > second ? first : second))
            if (lcm % first == 0 && lcm % second == 0)
                break;
        System.out.println("LCM " + lcm);
    }

}
