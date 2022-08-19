package assignments.saurabhSukhla.arrays16;


//3. Write a program to calculate the sum of all even numbers and sum of all odd
//numbers, which are stored in an array of size 10. Take array values from the user

import java.util.Arrays;

public class Q3SumOfAllEvenNumberAndOddNumbers {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter A Numbers");
//        int x=scanner.nextInt();
        int[] arr = {12, 4, 6, 7, 8, 79};
        sumOfAllOddAndEvenNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sumOfAllOddAndEvenNumbers(int arr[]) {
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even = even + arr[i];
            else
                odd = odd + arr[i];
        }
        System.out.println("Sum Of Even Numbers " + even);
        System.out.println("Sum Of Odd Numbers " + odd);
    }
}
