package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C231A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        for(int i=0; i<n; i++){
            String[] string = reader.readLine().split(" ");
            int sum = 0;
            for (int j=0;j<string.length; j++){
                sum += Integer.parseInt(string[j]);
            }
            if(sum>=2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
