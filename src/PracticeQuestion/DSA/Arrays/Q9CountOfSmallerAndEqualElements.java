package PracticeQuestion.DSA.Arrays;

public class Q9CountOfSmallerAndEqualElements {
    public static void main(String[] args) {
//        int []arr ={2,6,12,18,21,26,33,42};
//        int []arr ={2,6,12,18,21,26,26,26};
       int []arr ={2,6,12,24,26,26,28,30};
            int target =26;
        System.out.println(countSmallerAndEqualElements(arr,target));
    }

    public static int countSmallerAndEqualElements(int arr[], int target){
        int start =0;
        int end= arr.length-1;
        int mid =0;
        while (start<=end){
            mid=start+(end-start)/2;
            if (target==arr[mid]){
                while (mid+1<arr.length && arr[mid+1]==target){
                    mid++;
                }
                break;
            }
            else if (target<arr[mid]){
                end =mid-1;
            }else {
                start =mid+1;
            }
        }
        if (arr[mid]>target){
            return mid;
        }else {
            return mid+1;
        }
    }
}
