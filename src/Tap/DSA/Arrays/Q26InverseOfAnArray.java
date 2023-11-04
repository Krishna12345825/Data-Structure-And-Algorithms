package Tap.DSA.Arrays;

public class Q26InverseOfAnArray {
    public static void main(String[] args) {
        int arr[] ={2,3,1,0,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int result[] =inverse(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static int[] inverse(int []a){
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int v =a[i];
            b[v] =i;
        }
        return b;
    }
}
