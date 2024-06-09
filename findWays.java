public class findWays {
    static int find(int i , int j, int m, int n, int[][] grid ){
        if(i==m || j==n)return 0;
        if(grid[i][j]== 1)return 0;
        if(i==m-1 && j==n-1)return 1;
        return find(i+1,j,m,n,grid) + find(i,j+1,m, n, grid);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        int i =0; int j = 0;
        int m =4;
        int n = 4;
        System.out.println(find(i,j,m,n,arr));
    }
}
