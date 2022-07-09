package basic2;

import java.util.Scanner;

public class PrimeNum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();

        if (num == 1){
            System.out.println("1 is neither prime nor composite");
        }
        int i = 2;
        int flag = 0;
        while (i*i < num){
            if (num%i == 0){
                System.out.println(num + " is not a prime number");
                flag = 1;
                break;
            }
            i += 1;
        }
        if (flag == 0) System.out.println(num + " is a prime number");
    }
}
