import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        String input = "programming";
        String input1 = "gramming";

        if (isSubstring(input, input1)) {
            System.out.println("Substring found");
        } else {
            System.out.println("No substring found");
        }
    }

    static boolean isSubstring(String s, String s1) {
        int len1 = s.length();
        int len2 = s1.length();

        for (int i = 0; i <= len1 - len2; i++) {
            int j;

            for (j = 0; j < len2; j++) {
                if (s.charAt(i + j) != s1.charAt(j)) {
                    break;
                }
            }

            if (j == len2) {
                // If the loop didn't break, it means we found a substring match
                return true;
            }
        }

        // If no match is found
        return false;
    }
}
