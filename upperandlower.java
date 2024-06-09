public class upperandlower {
    static void print(int[][] arr, int r, int c){
        //upper
        int[][] upper = new int[r][c];
        int[][] lower = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++) {
                upper[i][j] = arr[i][j];
                lower[i][j] = arr[i][j];
            }
        }
        for(int i=0;i<r-1;i++){
            for(int j=c-1;j>i;j--){
               upper[i][j] = 0;
            }
        }
        for(int i=1;i<r;i++){
            for(int j=0;j<i;j++){
                lower[i][j] = 0;
            }
        }
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++) {
                System.out.print(upper[i][j]+" ");

            }
            System.out.println();
        }
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++) {
                System.out.print(lower[i][j]+" ");

            }
            System.out.println();
        }

    }

    static void lower(int matrix[][],
                      int row, int col)
    {
        int i, j;
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                if (i < j)
                {
                    System.out.print("0" + " ");
                }
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void upper(int matrix[][],
                      int row, int col)
    {
        int i, j;
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                if (i > j)
                {
                    System.out.print("0" + " ");
                }
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
         print(arr,3,3);
    }
}
