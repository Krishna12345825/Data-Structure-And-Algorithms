package TapDSA.Programming.Loops;

import java.util.Scanner;
/*
Count the number of digits in a positive integer.
*/
public class Q11CountDigitsInInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = countDigits(num);
        System.out.println(count);
    }

    public static int countDigits(int num) {
        int count = 0;
        while(num>0){
            num = num / 10;
            count++;
        }
        return count;
    }
}
