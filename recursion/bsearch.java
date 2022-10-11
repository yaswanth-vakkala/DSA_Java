package recursion;
//3 types of variables - arguments, return types, body of function
//f(n) = O(1) + f(n/2)
//divide and conquer rec relation
public class bsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,4, 0, arr.length-1));
        System.out.println(search(arr, 12342, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }

        int mid = s + (e-s)/2;
        if (arr[mid] == target){
            return mid;
        }

        if (arr[mid] > target){
            return search(arr, target, s, mid-1);
        }
        return search(arr, target, mid+1, e);
    }
}
