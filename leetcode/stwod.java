package leetcode;

public class stwod {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(bsearch(arr, 3));
    }

    static boolean bsearch(int[][] matrix, int target){
        int lo = 0;
        if(matrix.length == 0) return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int hi = (n * m) - 1;

        while(lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if(matrix[mid/m][mid % m] == target) {
                System.out.println(matrix[mid/m][mid%m]);
                System.out.println(mid/m);
                System.out.println(mid%m);
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                lo = mid + 1;
                System.out.println(mid/m);
                System.out.println(mid%m);
            }
            else {
                hi = mid - 1;
                System.out.println(mid/m);
                System.out.println(mid%m);
            }
        }
        return false;
    }
}
