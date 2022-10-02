package s_atoz.patterns;

public class pattern11 {
    public static void main(String[] args) {
        for (int i=1; i<6; i++){
            for (int j=i; j>0; j--){
                if (j % 2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
