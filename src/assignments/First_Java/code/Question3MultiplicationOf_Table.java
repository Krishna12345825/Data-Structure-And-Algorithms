package assignments.First_Java.code;

import java.util.Scanner;

public class Question3MultiplicationOf_Table {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter  the Table");
        int table=scanner.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(table+" * " +i+" = "+ table*i);
        }
    }
}
