package PracticeQuestion.DSA.Arrays;

// move zero to end   leetcode : 283
public class Q24MoveZeroToEnd {
    public static void main(String[] args) {
        int nums[] = {0,4,0,5,7,7,0};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        movezeros(nums);
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void movezeros(int []nums){
        int size = nums.length;
        if (size==0 || size==1){
            return;
        }
        int nonzero=0, zero=0;
        while (nonzero<size){
            if (nums[nonzero]!=0){
                int temp =nums[nonzero];
                nums[nonzero]= nums[zero];
                nums[zero]= temp;
                nonzero++;
                zero++;
            }else {
                nonzero++;
            }
        }
    }
}
