package leetcode;

public class cones {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(find(arr));
    }

    static int find(int[] nums){
        int count =0;
        int max = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }else{
                if(count > max){
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }
}
