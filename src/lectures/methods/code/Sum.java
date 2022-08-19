package lectures.methods.code;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // sum();


        int ans = sum2();
        System.out.println(ans);


        int ans2 = sum3(12, 23);
        System.out.println(ans2);
    }

    // pass the value of number when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }


    // return the value
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 :");
        int num2 = sc.nextInt();
        int sum = num2 + num1;
        return sum;
        //  System.out.println("This will never execute");
    }


    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number 2 :");
        int num2 = sc.nextInt();
        int sum = num2 + num1;
        System.out.println(sum);
    }


    /*
    return_type name(arguments){
    // body
    return statement;
     */
}
