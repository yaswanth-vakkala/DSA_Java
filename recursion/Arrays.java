package recursion;
//Recursion array type questions
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        System.out.println(isSorted(arr));
        System.out.println(lsearch(arr, 5, 0));
        System.out.println(find(arr, 5, 0));
        lsearch1(arr,5,0);
        System.out.println(list);
        System.out.println(lsearch2(arr, 5, 0, new ArrayList<>()));
        System.out.println(lsearch3(arr, 5, 0));
        System.out.println(rbsearch(arr, 4, 0, arr.length-1));

    }

    static boolean isSorted(int[] arr){
        return helper1(arr, 0); // helper func is optional but we need to include index in arguments
    }

    static boolean helper1(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }

        return arr[index] <= arr[index+1] && helper1(arr, index+1);
    }

    static int lsearch(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }

        return lsearch(arr, target, index+1);
    }

    static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void lsearch1(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }

        if (arr[index] == target){
            list.add(index);
        }

        lsearch1(arr, target, index+1);
    }

    static ArrayList<Integer> lsearch2(int[] arr, int target, int index, ArrayList<Integer> list){
        //returning arrlist using params
        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        return lsearch2(arr, target, index+1, list);
    }

    static ArrayList<Integer> lsearch3(int[] arr, int target, int index){
        //returning arrlist using body
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls =  lsearch3(arr, target, index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }

    static int rbsearch(int[] arr, int target, int s, int e){
        if (s>e){
            return  -1;
        }

        int m = s + (e-s)/2;

        if (arr[m] == target){
            return m;
        }

        if (arr[s] <= arr[m]){
            if (target >= arr[s] && target<= arr[m]){
                return rbsearch(arr, target, s, m-1);
            }else {
                return rbsearch(arr, target, m+1, e);
            }
        }
        if (target >= arr[m] && target <= arr[e]){
            return rbsearch(arr, target, m+1,e);
        }else{
            return rbsearch(arr, target, s, m-1);
        }
    }

}
