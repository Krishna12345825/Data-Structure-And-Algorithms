package Tap.RunningClass.Strings.Day3_CountConstants_RemoveCharacters;

import java.util.Scanner;

// count constant,special, vowel, numeric
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
       countConstant(input);

    }
    static void countConstant(String s){
        int vowelCount = 0, consonentCount = 0, numericCharacterCount = 0, specialCharacterCount = 0;
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelCount++;
                }else {
                    consonentCount++;
                }
            } else if (ch >= '0' && ch <= '9') {
                numericCharacterCount++;
            }else {
                specialCharacterCount++;
            }
        }
        System.out.println(" Vowel : -  " +vowelCount);
        System.out.println("Consonent : - " + consonentCount);
        System.out.println("Numeric : - " + numericCharacterCount);
        System.out.println("Special : - " + specialCharacterCount);
    }
}
