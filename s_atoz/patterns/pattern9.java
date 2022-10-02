package s_atoz.patterns;

public class pattern9 {
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
        int tmp2 = 9;
        for (int i=0; i<5; i++){
            for(int j=i; j>0; j--){
                System.out.print(" ");
            }
            for (int k=tmp2; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
            tmp2 -= 2;
        }
    }
}
