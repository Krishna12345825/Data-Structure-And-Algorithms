import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number ");
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        int sum = x+y;
        int sub=x-y;
        System.out.println("Sum of Two Number "+ sum);
        System.out.println("Subtraction of Two Number "+ sub);
    }
}
