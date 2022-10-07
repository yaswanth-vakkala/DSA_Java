package sorting;
//sort arr in n comparisions.
//pattern - when given nos from range 1 to N use csort
//select an element and swap it with correct index
//space complexity - O(1), time complexity - O(n)

import java.util.Arrays;

public class cyclicSort {
    static void sort(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i , correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
