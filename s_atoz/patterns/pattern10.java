package s_atoz.patterns;

public class pattern10 {
    public static void main(String[] args) {
        int tmp = 4;
        for (int i=1; i<6; i++){
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            for (int k=tmp; k>0; k--){
                System.out.print(" ");
            }
            System.out.println();
            tmp -= 1;
        }
        int tmp2 = 1;
        for (int i=4; i>0; i--){
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            for (int k= tmp; k>0; k--){
                System.out.print(" ");
            }
            System.out.println();
            tmp2 += 1;
        }
    }
}
