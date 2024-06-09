import java.util.Scanner;

public class Trailingzeros {
    static  int findTrailingZeros(int n ){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res += n/i;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findTrailingZeros(n));

    }
}
