package TapDSA.Arrays;

public class Q22RotateAnArray {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        rotate(a,3);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void rotateOne(int []arr){
        int temp=arr[0];
        for (int i = 1; i<arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] =temp;
    }
    public static void rotate(int []arr, int k){
        k= k%arr.length;
        if (k<0){
            k=k+arr.length;
        }
        for (int i = 1; i <k; i++) {
            rotateOne(arr);
        }
    }
}
