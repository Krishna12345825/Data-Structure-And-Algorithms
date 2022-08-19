package assignments.saurabhSukhla.arrays16;

//1. Write a program to calculate the sum of numbers stored in an array of size 10. Take
//array values from the user.
public class Q1SumOfNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ans = sumOfNumbers(arr);
        System.out.println(ans);
    }

    public static int sumOfNumbers(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
