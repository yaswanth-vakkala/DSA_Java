package recursion;
//we take a pivot(any element) after 1st pass all elements <p will be on lhs on p
//and elements > p will be on rhs of pivot
//after every pass we put pivot at correct position
//unlike merge sort when arr is sorted in qsort we dont go all the end to base condition
//pick a pivot - random or corner or middle element.
//recur relation = T(n) = T(k) + T(N-k-1) + O(N)
//time complexity = O(n^2)-if pivot is largest or smallest num and in corner, best case O(nlogn)-if pivot divedes arr in 2
//not stable algorithm, in place, ms is better in ll compared to qsort

import java.util.Arrays;

//Hybrid sorting algorithms - ex:tim sort
//merge sort + insertion sort as isort works well with partially sorted data
public class qsort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //pattern - for inplace algo we usually work with indexes
    static void sort(int[] arr, int low, int high){
        if (low>=high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }

            if (s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        sort(arr, low, e);
        sort(arr, s, high);
    }
}
