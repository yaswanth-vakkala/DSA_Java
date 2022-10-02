package s_atoz.patterns;

public class pattern7 {
    public static void main(String[] args) {
        int tmp = 1;
        for (int i=5; i>0; i--){
            for(int j=i-1; j>0; j--){
                System.out.print(" ");
            }
            for (int k=tmp; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
            tmp += 2;
        }
    }
}
