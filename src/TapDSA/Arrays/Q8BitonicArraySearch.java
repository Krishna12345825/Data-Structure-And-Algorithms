package TapDSA.Arrays;

public class Q8BitonicArraySearch {
    public static void main(String[] args) {
        int arr[] ={5,6,7,8,9,10,3,2,1};
        int b = 3;
        int bIndex = findBitonicPoint(arr);
        System.out.println(searchBitonic(arr,b,bIndex));
    }

    public static int ascendingOrderBinarySerch(int []arr, int target, int range){
        int start=0;
        int end=range, mid=0;
        while (start<=end){
            mid =start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            }else if (target<arr[mid]){
                end = mid-1;
            }else {
                start =mid+1;
            }
        }
        return -1;
    }


    public static int descendingOrderBinarySearch(int []arr,int target, int range){
        int start=0;
        int end=range, mid=0;
        while(start<=end){
            mid =start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }else if (target<arr[mid]){
                start =mid+1;
            }else {
                end =mid-1;
            }
        }
        return -1;
    }


    public static int findBitonicPoint(int arr[]){
        int start=0;
        int end=arr.length-1, mid=0;
        while (start<=end){
            mid =start+(end-start)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                start =mid;
            }else {
                end =mid;
            }
        }
        return -1;
    }


    public static int searchBitonic(int arr[], int target, int bitonicIndex){
        if (arr[bitonicIndex]==target){
            return bitonicIndex;
        }
        if (target>arr[bitonicIndex]){
            return -1;
        }
        int result1 = ascendingOrderBinarySerch(arr,target,bitonicIndex-1);
            if (result1!=-1){
                return result1;
            }

            int result2 = descendingOrderBinarySearch(arr,target,bitonicIndex+1);
                if (result2!=-1){
                    return result2;
                }
                return -1;
    }

}
