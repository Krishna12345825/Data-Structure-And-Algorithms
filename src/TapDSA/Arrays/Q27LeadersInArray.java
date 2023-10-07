package TapDSA.Arrays;

public class Q27LeadersInArray {
    public static void main(String[] args) {
        int arr[] = {8,11,5,11,7,6,3};
        leadersInArray(arr);
    }

    public static void leadersInArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            boolean  isLeaders =true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>=arr[i]){
                    isLeaders =false;
                    break;
                }
            }
            if (isLeaders==true){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
