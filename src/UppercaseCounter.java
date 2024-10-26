//import java.util.*;
//
//public class Q1 {
//    public static void main(String[] args) {
//        // Read the number of strings
//        int N = Integer.parseInt(scanner.nextLine());
//
//        // Process each string
//        for (int i = 0; i < N; i++) {
//            String inputString = scanner.nextLine();
//            int uppercaseCount = countUppercase(inputString);
//            System.out.println(uppercaseCount);
//        }
//
//        scanner.close();
//    }
//
//
//
//    private static int countUppercase(String str) {
//        int count = 0;
//        for (char ch : str.toCharArray()) {
//            if (Character.isUpperCase(ch)) {
//                count++;
//            }
//        }
//        return count;
//    }
//}
//


import java.util.Scanner;

public class UppercaseCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of strings
        int N = Integer.parseInt(scanner.nextLine());

        // Process each string
        for (int i = 0; i < N; i++) {
            String inputString = scanner.nextLine();
            int uppercaseCount = countUppercase(inputString);
            System.out.println(uppercaseCount);
        }

        scanner.close();
    }

    // Method to count uppercase characters in a string

    private static int countUppercase(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }
}




