package TapDSA.Programming.IfElse;

import java.util.Scanner;

/*
Check if a given number is the ASCII value of a lowercase alphabet.
*/
public class Q12LowercaseASCIIValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=97 && n<=122){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
