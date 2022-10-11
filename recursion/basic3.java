package recursion;

public class basic3 {
    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(sum(3));
        System.out.println(sumd(13425));
        System.out.println(productd(13425));
        reverse1(1234);
        System.out.println(sum);
        System.out.println(reverse2(12345));
        System.out.println(palindrome(121));
        System.out.println(czeros(102010020));
    }

    static int fact(int n){
        if (n<=0){
            return 1;
        }

        return n * fact(--n);//here n-- will not work as n will pass before --
    }

    static int sum(int n){
        if (n<=0){
            return 0;
        }

        return n+sum(n-1);
    }

    static int sumd(int n){
        if (n<=0){
            return 0;
        }

        return n%10 + sumd(n/10);
    }

    static int productd(int n){
        if (n<=0){
            return 1;
        }

        return n%10 * productd(n/10);
    }

    static int sum = 0;
    static void reverse1(int n){
        if (n==0){
            return;
        }

        int rem = n % 10;
        sum = sum *10 + rem;
        reverse1(n/10);
    }

    static int reverse2(int n){
        //sometimes you might need some additional vars in arguments
        //in that case make another function
        int digits = (int)(Math.log10(n))+1;
        return helper(n, digits);
    }

    static int helper(int n, int digits){
        if (n%10 == n){
            return n;
        }

        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    static boolean palindrome(int n){
        return n == reverse2(n);
    }

    static int czeros(int n){
        return helper1(n, 0);
    }

    static int helper1(int n, int c){
        if (n==0){
            return c;
        }

        if (n%10 == 0){
            return helper1(n/10, c+1);
        }else{
            return helper1(n/10, c);
        }
    }
}
