package s_atoz.patterns;

public class pattern8 {
    public static void main(String[] args) {
        int tmp = 9;
        for (int i=0; i<5; i++){
            for(int j=i; j>0; j--){
                System.out.print(" ");
            }
            for (int k=tmp; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
            tmp -= 2;
        }
    }
}
