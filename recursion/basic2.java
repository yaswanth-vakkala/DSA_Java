package recursion;
//recursion - function calling another function
//all function have same parameter and body except for name
//when func is not finished executing it will remain in stack
//when function finishes executing it is removed from stack and flow to program in restored to where func is called
//instead of multiple function we can reduce repitition using recursion by calling function itself

//using recursion we can solve complex problems in simple way by breaking them into smaller problems
//we can convert recursion solution into iteration and vice versa
//space complexity is just heigth of recursion tree
//visualize recursion using recursion tree
public class basic2 {
    public static void main(String[] args) {
        //wriet a func that takes in a num and prints it
        //print first 3 nums by calling a single func
        print1(1);
        printn(5);
        printn1(5);
    }

    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
    }

    static void printn(int n){
        //every func call has seperate memory in stack
        if (n<=0){ //base condition where recursion will stop making new calls
            return;
        }//with no condition we get stack overflow error / infinite recursion
        printn(n-1); //if printn is last line in func it is tail recursion and it shouldn't do any
        //operatoin after calling func and with value returned
        System.out.print(n);

    }

    static void printn1(int n){//time and space complexity - O(n)
        if (n<=0){
            return;
        }

        System.out.print(n);
        printn1(n-1);
    }
}
