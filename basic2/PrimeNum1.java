package basic2;

import java.util.Scanner;

public class PrimeNum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();

        if (num == 1){
            System.out.println("1 is neither prime nor composite");
        }
        int count = 0;
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }
        if (count > 0){
            System.out.println(num + " is not a prime number");
        }else {
            System.out.println(num + " is a prime number");
        }
    }
}
