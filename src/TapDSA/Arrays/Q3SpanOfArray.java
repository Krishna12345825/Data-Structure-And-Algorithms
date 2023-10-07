package TapDSA.Arrays;

public class Q3SpanOfArray {
    public static void main(String[] args) {
        int [] arr= {20,42,88,10,99,6};
        System.out.println(spanOfArray(arr));
    }

    public static int spanOfArray(int []arr){
        int min=arr[0];
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max =arr[i];
            }
            if (arr[i]<min){
                min =arr[i];
            }
        }
        return max-min;
    }
}
