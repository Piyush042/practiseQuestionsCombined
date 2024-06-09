import java.util.Scanner;

public class minBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Principal= sc.nextInt();
        int time = sc.nextInt();
        int n1 = sc.nextInt();
        float[][] banka = new float[n1][2];
        for(int i =0;i<n1;i++){
            for(int j=0;j<2;j++){
                banka[i][j] = sc.nextFloat();
            }
        }
        int n2 = sc.nextInt();
        float[][] bankb = new float[n2][2];
        for(int i =0;i<n1;i++){
            for(int j=0;j<2;j++){
                bankb[i][j] = sc.nextFloat();
            }
        }
        int emia=0;
        for(int i =0;i<n1;i++){
            int pow = (int) Math.pow((1 + banka[i][1]),(banka[i][0] * 12));
            int i1 = 1 / pow;

            int dr =  1-i1;
            emia += Principal * banka[i][1] / dr;

        }
        int emib = 0;
        for(int i =0;i<n1;i++){
            int pow = (int) Math.pow((1 + bankb[i][1]),(bankb[i][0] * 12));
            int i1 = 1 / pow;

            int dr =  1-i1;
            emib += Principal * bankb[i][1] / dr;

        }
        if(emia>emib){
            System.out.println("Bank b");
        }
        else{
            System.out.println("Bank a");
        }

    }
}
