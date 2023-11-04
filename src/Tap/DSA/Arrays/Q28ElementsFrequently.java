package Tap.DSA.Arrays;
// Frequency of an Elements in a sorted Array
public class Q28ElementsFrequently {
    public static void main(String[] args) {
        int []arr= {20,20,30,30,30};
        frequency(arr);
    }


    public static void frequency(int []arr){
        int freq =1;
        int i =1;
        while (i<arr.length){
            while (i<arr.length && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            freq=1;
            i++;
        }
    }
}
