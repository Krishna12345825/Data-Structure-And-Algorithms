package TapDSA.Arrays;

// First and last position in a given elements  leedcode:- 34(medium)
public class Q10FirstAndLastPostion {
    public static void main(String[] args) {
        int [] arr ={3,4,4,4,4,4,4,4,6};
        int target =4;
        System.out.println(searchRange(arr,target));
    }

    public static int[] searchRange(int []nums, int target){
        int start =0;
        int end = nums.length-1;
        int mid =0;
        int []result ={-1,-1};
        while (start<=end){
            mid =start+(end-start)/2;
             if (target==nums[mid]){
                 result[0]=mid;
                 end =mid-1;
             } else if (nums[mid]<target) {
                 start =mid+1;
             }else {
                 end =mid-1;
             }
        }
        start =0;
        end =nums.length-1;
        mid =0;
        while (start<=end){
            mid =start+(end-start)/2;
            if (target==nums[mid]){
                result[1] =mid;
                start =mid+1;
            } else if (nums[mid]<target) {
                start =mid+1;
            }else {
                end =mid-1;
            }
        }
        return result;
    }
}
