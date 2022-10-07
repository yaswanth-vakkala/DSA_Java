package sorting;

import java.util.Arrays;

//select an element and put it at its correct index
//we can select largest or smallest element and correct indexes
//space complexity - O(1) , time complexity - O(n^2)
//not stable, it performs well on small arrays
public class ssort {

    static void sort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i=start; i<=end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {6,4,3,10,17,91,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
