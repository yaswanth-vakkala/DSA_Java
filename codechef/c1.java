package codechef;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class C1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            int[] count = new int[]{0,0,0,0,0,0,0,0,0,0};
            int len = input.nextInt();
            for(int j=0; j<len; j++){
                int num = input.nextInt();
                count[num] += 1;
            }
            int max = 0;
            int flag = 0;
            for(int k=0; k<count.length; k++){
                if (count[k] > max){
                    max = count[k];
                }else if(count[k] == max && count[k] != 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
                flag = 0;
            }
        }


    }
}

