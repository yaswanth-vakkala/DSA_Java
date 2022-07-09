package basic;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter the operator: ");
        char operator = input.next().trim().charAt(0);

        if (operator == '+'){
            System.out.println(num1 + num2);
        }else if (operator == '-'){
            System.out.println(num1 - num2);
        }else if (operator == '*'){
            System.out.println(num1 * num2);
        }else if (operator == '/'){
            System.out.println(num1 / num2);
        }else if (operator == '%'){
            System.out.println(num1 % num2);
        }else {
            System.out.println("Invalid Operator");
        }
    }
}
