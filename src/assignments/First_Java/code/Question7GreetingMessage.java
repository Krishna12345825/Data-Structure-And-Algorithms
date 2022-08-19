package assignments.First_Java.code;

import java.util.Scanner;

public class Question7GreetingMessage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name");
        String name= scanner.next();
        System.out.println("Hii How are you "+name);
    }
}
