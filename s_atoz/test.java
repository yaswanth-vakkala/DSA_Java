package s_atoz;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }
    static int minJumps(int[] arr){
        // your code here
        int arrlen = arr.length;
        int count = 0;
        int icount = 0;
        while(icount < arrlen -1){
            int value = arr[icount];
            count++;
            icount += value;
        }
        if(icount == arrlen-1){
            return count;
        }else{
            return -1;
        }
    }
}
