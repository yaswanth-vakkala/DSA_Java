package codechef;

import java.util.Scanner;

public class HungryChef {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int nI = input.nextInt();
        for(int i=0; i<nI; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            int n = input.nextInt();
            int r = input.nextInt();

            if (x > r && y > r) {
                System.out.println(-1);
            } else {
                int sum = 0;
                int yCount = 0;
                int xCount = 0;
                while (sum + y < r && yCount < n) {
                    sum += y;
                    yCount++;
                }
                if (yCount == n) {
                    System.out.print(xCount + " ");
                    System.out.print(yCount);
                }else {
                    while (xCount + yCount < n) {
                        sum -= y;
                        xCount++;
                        yCount--;
                    }
                    System.out.println(xCount + " ");
                    System.out.println(yCount);
                }
            }
        }
    }
}