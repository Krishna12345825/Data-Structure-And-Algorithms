package TapDSA.Programming.IfElse;

import java.util.Scanner;

/*
Check if a given number is the ASCII value of an uppercase alphabet or not.
*/
public class Q11UppercaseASCIICheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=65 && n<=96){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
