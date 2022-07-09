package basic;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check it is even or odd: ");
        int input_number = input.nextInt();
        if (input_number%2 == 0){
            System.out.println("The input number is even");
        }else{
            System.out.println("The input number is odd");
        }
    }
}
