package basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int principal = input.nextInt();
        System.out.print("Enter how many years of time: ");
        int time = input.nextInt();
        System.out.print("Enter the interest rate: ");
        float rate = input.nextFloat();

        float simpleInterest = (principal * time * rate) / 100;
        System.out.println("simple interest = " + simpleInterest);
    }
}
