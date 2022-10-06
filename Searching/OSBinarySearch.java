package Searching;
//order agnostic binary search - we dont know if arr is sorted in asc or desc order
public class OSBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(orderAgnosticBS(arr,4));
        System.out.println(orderAgnosticBS(arr, 12342));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid-1;
                }else if(target > arr[mid]){
                    start = mid+1;
                }
            }else{
                if (target < arr[mid]){
                    start = mid +1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }

            }
        }
        return -1;
    }
}
