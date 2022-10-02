package codeforces;

import java.util.Scanner;

public class C4A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n<4){
            System.out.println("NO");
        }else{
            if(n%2==0){
                System.out.println("YES");
            }
        }
    }
}
