package recursion;


import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
        p1(4, 0);
        p2(4, 0);
        int arr[] = {4,3,2,1};
        bsort(arr, arr.length-1, 0);
        System.out.println();
        System.out.println(Arrays.toString(arr));
        int arr1[] = {4,3,2,1};
        ssort(arr1, arr1.length, 0, 0);
        System.out.println(Arrays.toString(arr1));


    }

    //This is same as bubble sort
    static void p1(int r, int c){//2 vars as 2 loops used in pattern interation method
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print("*");
            p1(r, c+1);
        }else {
            System.out.println();
            p1(r-1, 0);
        }
    }

    static void p2(int r, int c){//2 vars as 2 loops used in pattern interation method
        if (r==0){
            return;
        }
        if (c<r){
            p2(r, c+1);
            System.out.print("*");
        }else {
            p2(r-1, 0);
            System.out.println();
        }
    }

    static void bsort(int[] arr, int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            if (arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c]  = arr[c+1];
                arr[c+1] = temp;
            }
            bsort(arr, r, c+1);
        }else {
            bsort(arr, r-1, 0);
        }
    }

    static void ssort(int[] arr, int r, int c, int max){
        if (r==0){
            return;
        }
        if (c<r){
            if (arr[c] > arr[max]){
                ssort(arr, r, c+1, c);
            }else {
                ssort(arr, r, c+1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            ssort(arr, r-1, 0, 0);
        }
    }
}


