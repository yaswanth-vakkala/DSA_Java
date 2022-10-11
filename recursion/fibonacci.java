package recursion;
//here we can break problem into smaller problem(add of 2 nums) so we can use recursion
//f(n) = f(n-1) + f(n-2) - recurrence relation formula
//here base condition is represented by ans we already have
//linear rec relation
//we have repeated func calls like f(2) but we need dp to solve this.
//linear rec relation is very inefficient for ex try 50 fib value and see program crash
//time complexity is golden reation power n
public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibn(6));
    }

    static int fibn(int n){
        if (n<2){
            return n;
        }

        return fibn(n-1) + fibn(n-2);//not tail recursion as adding and returning value
    }
}
