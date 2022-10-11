package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//subset, subsequence, string recursion question
public class sss {
    public static void main(String[] args) {
        removea1("", "baacaad");
        System.out.println(removea2("baacaad"));
        System.out.println(skipApple("bacdappleds"));
        subseq("", "abc");
        System.out.println(subseq1("", "abc"));
        subseq2("", "abc");
        System.out.println(subseq3("", "abc"));
        int arr[] = {1,2,3};
        System.out.println(subset4(arr));
    }
    //string problems
    //O(n) - time complexity
    static void removea1(String p, String up){
        //1. pass ans string in arg
        //2.create ans var in function body

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch=='a'){
            removea1(p, up.substring(1));
        }else {
            removea1(p+ch, up.substring(1));
        }
    }

    static String removea2(String s){
        //1. pass ans string in arg
        //2.create ans var in function body

        if (s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);
        if (ch=='a'){
            return removea2(s.substring(1));
        }else {
            return ch + removea2(s.substring(1));
        }
    }

    static String skipApple(String s){
        if (s.isEmpty()){
            return "";
        }

        if (s.startsWith("apple")){
            return skipApple(s.substring(5));
        }else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }

    //subsets or subsequence problems
    //permutatoins and combinations
    //subset - non adjacent collection, may or may not be continuous
    //lets see recursion and iteration methods
    //in subsets ordering should not change as it results in same set reversed but can skip middle elements
    //This pattern of taking some elements and removing some is known as subset pattern
    //subset means for arr, subsequence for strings

    static void subseq(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseq1(String p , String up){
        //create arrlist outsied and pass in arguments
        //create it in func body
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left =  subseq1(p+ch, up.substring(1));
        ArrayList<String> right =  subseq1(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseq2(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq2(p+ch, up.substring(1));
        subseq2(p, up.substring(1));
        subseq2(p+(ch+0), up.substring(1));
    }

    static ArrayList<String> subseq3(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left =  subseq3(p+ch, up.substring(1));
        ArrayList<String> right =  subseq3(p, up.substring(1));
        ArrayList<String> third =  subseq3(p+(ch+0), up.substring(1));

        left.addAll(right);
        left.addAll(third);
        return left;
    }

    static List<List<Integer>> subset4(int[] arr){
        List<List<Integer>> outer= new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num:arr){
            int n = outer.size();
            for(int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;
        //time complexity - O(n*2^n), sc - O(2^n*n)
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
