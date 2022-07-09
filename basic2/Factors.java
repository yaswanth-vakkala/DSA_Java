package basic2;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for generating it's factors: ");
        int number = input.nextInt();
        System.out.print("The factors are: ");

        for (int i=1; i<=number; i++){
            if (number%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
