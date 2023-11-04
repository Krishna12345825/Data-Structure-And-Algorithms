package Tap.DSA.Strings;
import java.util.Scanner;
public class InvalidBracket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int bracket=0, count=0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                bracket++;
            }
            else {
                if(bracket <= 0) {
                    count++;
                }else {
                    bracket--;
                }
            }
        }
        System.out.println(count + bracket);
    }

}
