package s_atoz.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ssort {
    public static void main(String[] args) {
        int[] arr = {4,7,1,12,34,32,65,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    swap(arr, i ,j);
                }
            }
        }
    }
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
