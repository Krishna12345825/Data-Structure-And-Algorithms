package assignments.saurabhSukhla.arrays16;
//4. Write a program to find the greatest number stored in an array of size 10. Take array
//values from the user

public class Q4GreatestElementIantheArray {
    public static void main(String[] args) {
        int arr[] = {12, 45, 67, 9};
        int ans = greatest(arr);
        System.out.println(ans);
    }

    public static int greatest(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
