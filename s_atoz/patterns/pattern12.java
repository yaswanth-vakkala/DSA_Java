package s_atoz.patterns;

public class pattern12 {
    public static void main(String[] args) {
        int tmp = 6;
        for (int i=1; i<5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "");
            }
            for(int k=tmp; k>0; k--){
                System.out.print(" ");
            }
            for (int j = i; j>0; j--){
                System.out.print(j + "");
            }
            System.out.println();
            tmp -= 2;
        }
    }
}
