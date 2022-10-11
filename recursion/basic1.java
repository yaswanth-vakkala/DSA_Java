package recursion;

public class basic1 {
    public static void main(String[] args) {
        message();//calling function from another function
        //lets print hello world 3 times by calling function 1 time in main function
    }

    static void message(){
        System.out.println("Hello world");
        message1();//message only ends when message1 comes out after executed
    }

    static void message1(){
        System.out.println("Hello world");
        message2();//m1 ends when m2 comes out after executed
    }

    static void message2(){
        System.out.println("Hello world");
    }
}
