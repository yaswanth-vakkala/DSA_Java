package leetcode;

import java.util.Scanner;

public class ababa {
    public static void main(String[] args) {
        System.out.println(ps());
    }

    static int ps(){
        Scanner input = new Scanner(System.in);
        String digits = input.next();
        int n = input.nextInt();
        int count = 0;
        int total = 0;
        for (int i=0; i<n; i++){
            String next = input.next();
            for (int j=0; j<next.length(); j++){
                for (int k=0; k<digits.length(); k++){
                    if (next.charAt(j) == digits.charAt(k)){
                        count++;
                        break;
                    }
                }
            }
            if (count == next.length()){
                total++;
            }
            count = 0;
        }
        return total;
    }
}
