package recursion;

import java.util.ArrayList;

//we can rearrange the given sequence in any manner
//no of permutations will be n!
public class permutations {
    public static void main(String[] args) {
        perm1("", "abc");
        System.out.println(permutationsList("", "abc"));
        System.out.println(permutationsCount("", "abc"));
    }

    static void perm1(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i=0; i<= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            perm1(f+ch+s, up.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
