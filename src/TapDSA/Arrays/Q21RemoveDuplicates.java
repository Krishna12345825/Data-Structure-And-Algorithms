package TapDSA.Arrays;

// remove Duplicates from sorted Array
public class Q21RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] ={2,2,3,3,4,6,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            int result =removeDuplicates(arr);
            System.out.println();
            for (int j = 0; j < result; j++) {
                System.out.print(arr[j]+" ");
            }

    }


    public static int removeDuplicates(int []arr){
        int result=0;
        for (int i = 1; i <arr.length; i++) {
            if (arr[result]!=arr[i]){
                result++;
                arr[result] =arr[i];
            }
        }
        return result+1;
    }
}
