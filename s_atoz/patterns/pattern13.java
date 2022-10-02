package s_atoz.patterns;

public class pattern13 {
    public static void main(String[] args) {
        int tmp = 1;
        for (int i=1; i<6; i++){
            for (int j=tmp-i+1; j<= tmp; j++){
                System.out.print(j+"");
            }
            System.out.println();
            tmp += (i+1);

        }
    }
}
