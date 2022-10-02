package s_atoz.patterns;

public class pattern14 {
    public static void main(String[] args) {
        for (int j=4; j>0; j--){
            System.out.print("*");
        }
        System.out.println();
        for (int i=0; i<3; i++){

            for (int k=0; k<4; k++){
                if (k==0 || k==3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int j=4; j>0; j--){
            System.out.print("*");
        }
    }
}
