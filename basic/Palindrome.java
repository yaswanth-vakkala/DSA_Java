package basic;

public class Palindrome {
    public static void main(String[] args) {

    }
}

//Soved the question in leetcode, the solution is commented below

//class Solution {
//    public boolean isPalindrome(int x) {
//        int num = x;
//        int reversedNum = 0;
//        while(num > 0){
//            int rem = num % 10;
//            reversedNum = (reversedNum*10) + rem;
//            num = num/10;
//        }
//        return x == reversedNum;
//    }
//}