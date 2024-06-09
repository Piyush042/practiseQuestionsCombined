import java.util.Scanner;

public class squareFreeNum {
    static int findCount(int n){
        int count =0;
        for(int i =1;i<n;i++){
            if(n%i == 0){
                double rem = Math.sqrt(i);
                System.out.println(rem);
                if(rem == (int) Math.sqrt(i))count ++;
            }
        }
        return count-1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findCount(n));
    }
}
