package Tap.DSA.Arrays;

public class Q36MinimumConsecutiveFlips {
    public static void main(String[] args) {
     int arr[] = new int[]{1,1,0,0,1,1,0,0,0,1,1};
     minimumConsecutiveFlips(arr);
    }

    static void minimumConsecutiveFlips(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!=arr[i-1]){
                if (arr[i]!=arr[0]){
                    System.out.print(i+"-");
                }else {
                    System.out.println(i-1);
                }
            }
        }
        if (arr[0]!=arr[arr.length-1]){
            System.out.print(arr.length-1);
        }
    }
}
