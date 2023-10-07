package TapDSA.Arrays;

public class Q5SecondSmallestElementOfAnArray {
    public static void main(String[] args) {
        int [] arr= {20,42,88,10,99,6};
        System.out.println(secondSmallestNumber(arr));
    }
    public static int secondSmallestNumber(int arr[]){
        int min1=0, min2=0;
        if (arr[0]<arr[1]){
            min1 =arr[0];
            min2 =arr[1];
        }else {
            min1 =arr[1];
            min2 =arr[0];
        }
        for (int i = 2; i <arr.length ; i++) {
            if (arr[i]<min1){
                min2 =min1;
                min1 =arr[i];
            }else if (arr[i]<min2){
                min2 =arr[i];
            }
        }
        return min2;
    }
}
