package assignments.First_Java.code;

import java.util.Scanner;

//   7.To calculate Fibonacci Series up to n numbers.
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Numbers ");
        int n= scanner.nextInt();
        int first=0;
        int second=1;
        for (int i = 0; i < n; i++) {
            System.out.print( first +" ");
            int last=first+second;
            first=second;
            second=last;
        }
    }
}
