package PracticeQuestion.DSA.Arrays;

public class Q18ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,69,67};
        System.out.println(sortedOrNot(arr));
    }
     static  boolean sortedOrNot(int arr[]){
         for (int i = 1; i <arr.length ; i++) {
             if (arr[i] < arr[i - 1]){
                 return  false;
             }
         }
         return true;
     }
}
