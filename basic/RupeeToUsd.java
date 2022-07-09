package basic;

import java.util.Scanner;

public class RupeeToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money in indian rupees: ");
        double rupee = input.nextDouble();
        double dollar = 0.0126054;
        double currency_exchange = rupee * dollar;
        System.out.println(rupee+" rupees -> "+currency_exchange);
    }
}
