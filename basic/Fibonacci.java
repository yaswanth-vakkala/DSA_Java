package basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number n upto which you want fibonacci series: ");
        int n = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum;
        if (n == 1){
            System.out.println(num1);
        }else if (n == 2){
            System.out.print(num1 + " ");
            System.out.print(num2);
        }else {
            System.out.print(num1 +" ");
            System.out.print(num2 + " ");
            for (int i=2; i<n; i++){
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
                System.out.print(sum + " ");
            }
        }
    }
}
