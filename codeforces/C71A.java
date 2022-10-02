package codeforces;

import java.util.Scanner;

public class C71A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            String word = input.next();
            int len = word.length();
            Integer mid = len-2;
            if(len>10){
                String nword = word.charAt(0) + mid.toString() + word.charAt(len-1);
                System.out.println(nword);
            }else{
                System.out.println(word);
            }
        }
    }
}
