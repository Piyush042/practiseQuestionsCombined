public class josephus {
    static int findWays(int n, int k){

        if(n==1)return 0;
        return (findWays(n - 1, k) + (k % n));
    }
}
