package assignments.First_Java.code;
//    9.To find Armstrong Number between two given number.

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner scanner=  new Scanner(System.in);
        System.out.println("Enter the First Number");
        int first=scanner.nextInt();
        System.out.println("Enter the Last Number");
        int last=scanner.nextInt();
        for (int i = first; i <last ; i++) {
            if (isArmstrongNumber(i)){
                System.out.print(i +"  ");
            }
        }

    }


    public static boolean isArmstrongNumber(int nums){
        int sum=0,rem, originalNumber=nums;
        while (nums!=0){
            rem = nums%10;
            sum=sum+(rem*rem*rem);
            nums=nums/10;
        }
        return sum==originalNumber;
    }
}
