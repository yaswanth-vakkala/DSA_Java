package basic;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if armstrong: ");
        int num = input.nextInt();
        System.out.println(isAStrong(num));
    }

    public static boolean isAStrong(int num){
        int original = num;
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            sum += (rem * rem * rem);
            num = num/10;
        }
        return sum == original;
    }
}
