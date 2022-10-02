package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Divide {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int num = input.nextInt();
            if(a == b){
                System.out.println(-1);
            }else{
                while(true){
                    if(num % a == 0 && num % b != 0){
                        System.out.println(num);
                        break;
                    }else{
                        num += a;
                    }
                }
            }
        }
    }
}
