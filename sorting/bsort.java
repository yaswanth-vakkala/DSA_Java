package sorting;
//also know as sinking sort/ exchange sort
//space complexity - O(1) (inplace sorting algorithm), time complexity - O(n^2), best case - O(n)
//bubble sort is stable sorting algorithm - duplicate elements should be in same order after sorting


import java.util.Arrays;

public class bsort {
    static void sort(int[] arr){
        boolean swapped;
        for (int i=0; i<arr.length;i++){
            swapped = false;
            for (int j=1; j< arr.length-i;j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,4,3,10,17,91,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
