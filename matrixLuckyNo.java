import java.util.Scanner;

public class matrixLuckyNo {
    static int findLuckyNo(int[][] arr,int r, int c){
        int maxRowsum = 0;
        int maxColsum = 0;
        for(int i=0;i<r;i++){
            int rowsum = 0;
            for(int j =0;j<c;j++){
                rowsum += arr[i][j];
            }
            maxRowsum = Math.max(maxRowsum, rowsum);
        }
        for(int i =0;i<c;i++){
            int maxincol =0;
            for(int j=0;j<r;j++){
                int currcol = arr[i][j];
                if(currcol >maxincol){
                    maxincol = currcol;
                }
            }
            maxColsum += maxincol;
        }
        return maxColsum + maxRowsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findLuckyNo(arr,r,c));
    }
}
