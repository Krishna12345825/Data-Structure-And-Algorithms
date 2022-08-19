package assignments.First_Java;

import java.util.Scanner;

public class Question10Currency {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Rupees");
        int rupees= scanner.nextInt();
        System.out.println("USD "+rupees*0.013);
    }
}
