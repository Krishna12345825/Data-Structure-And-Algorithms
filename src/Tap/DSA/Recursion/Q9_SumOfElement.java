package Tap.DSA.Recursion;
// Sum of all elements in an array.
public class Q9_SumOfElement {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println(sumElements(arr,0));
    }
    public static int sumElements(int arr[], int i){
        if (arr.length==i){
            return 0;
        }
        return sumElements(arr,i+1)+arr[i];
    }
}
