package basic2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to check if it is a leap year: ");
        int year = input.nextInt();

        if (year%4 == 0){
            if (year%100 == 0){
                if (year%400 == 0) {
                    System.out.println("It is a leap year");
                }else System.out.println("It is not a leap year");
            }else System.out.println("It is a leap year");
        }else System.out.println("Not a leap year");
    }
}
