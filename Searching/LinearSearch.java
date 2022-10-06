package Searching;
//Linear search sequencially searches in sorted or unsorted arr
//num%10 - gives last digit, num/10 - removes last digit,
//(int)(Math.log10(num))+1; - to get count of digits in num
public class LinearSearch {
    public static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(linearSearch(arr,4));
        System.out.println(linearSearch(arr, 12342));
    }
}
