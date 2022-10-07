package sorting;

import java.util.Arrays;

//sort arr part by part - index by index - sub arr by sub arr - insert elememnt in correct position in lhs sorted sub arr
//space complexity - O(1), time complexity - O(n^2), O(n)
//stable sorting algorithm
//Takes part in hybrid sorting algorithm
public class isort {
    static void sort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j>0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6,4,3,10,17,91,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
