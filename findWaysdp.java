public class findWaysdp {
    static int findWays(int r, int c, int[][]arr){
       if(arr[0][0] == 1)return 0;
       if(r == 1 || c==1 )return 1;
       for(int i=0;i<r;i++){
           if(arr[i][0]!=1) {
               arr[i][0] = 1;
           }
           else{
               arr[i][0] = 0;

           }
       }
        for(int i=0;i<c;i++){
            if(arr[0][i]!=1) {
                arr[0][i] = 1;
            }
            else{
                arr[0][i] = 0;
            }
        }
        for (int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(arr[i][j] !=1){
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }


        return arr[r-1][c-1];
    }
    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

        int m =4;
        int n = 4;
        System.out.println(findWays(m,n,arr));
    }
}
