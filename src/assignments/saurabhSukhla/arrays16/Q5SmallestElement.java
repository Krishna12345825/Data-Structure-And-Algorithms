package assignments.saurabhSukhla.arrays16;

//5. Write a program to find the smallest number stored in an array of size 10. Take array
//values from the user.
public class Q5SmallestElement {
    public static void main(String[] args) {
        int arr[] = {12, 4, 0, 5, 6, 8, 90, 567, 90};
        int ans = smallest(arr);
        System.out.println(ans);
    }

    public static int smallest(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
