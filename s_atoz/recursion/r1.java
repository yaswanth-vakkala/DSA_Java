package s_atoz.recursion;

import java.util.Arrays;

public class r1 {
    public static void main(String[] args) {
        pname(1, 5);
        pname2(3, "karl");
        oton(4);
        ntoo(4);
        System.out.println();
        sumn(3,0);
        System.out.println(sumn2(3));
        System.out.println(fact(5));
        int[] arr1 = {1,2,3,4,5};
        revarr(arr1, 0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(palindrome("madam",0));
        System.out.println(palindrome("safd",0));
        System.out.println(fib(8));
    }
    static void pname(int i, int n){
        if (i>n){
            return;
        }
        System.out.println("name");
        pname(i+1, n);
    }

    static void pname2(int n, String name){
        if (n < 1){
            return;
        }
        System.out.println(name);
        pname2(n-1, name);
    }

    static void ntoo(int n){
        if (n<1){
            return;
        }
        System.out.print(n);
        ntoo(n-1);
    }

    static void oton(int n){
        if (n<1){
            return;
        }
        oton(n-1);
        System.out.print(n);
    }

    static void sumn(int n, int sum){
        //we are using parameter recursion approach
        if (n<1){
            System.out.println(sum);
            return;
        }
        sumn(n-1, sum+n);
    }

    static int sumn2(int n){
        if (n<1){
            return 0;
        }
        return n + sumn2(n-1);
    }

    static int fact(int n){
        if (n<1){
            return 1;
        }
        return n * fact(n-1);
    }

    static void revarr(int[] arr, int l, int r){
        if (l >= r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        revarr(arr, l+1, r-1);
    }

    static boolean palindrome(String s, int i){
        if (i >= s.length()){
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        palindrome(s, i+1);
        return true;
    }

    static int fib(int n){
        if (n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
