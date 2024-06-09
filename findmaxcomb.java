public class findmaxcomb {
    static int findMaxComb(int[] arr, int n,int p, int q, int r){
        int[] pmax = new int[n];
        int[] smax = new int[n];
        pmax[0] = p*arr[0];
        for(int i=1;i<n;i++){
            pmax[i] = Math.max(pmax[i-1],p*arr[i]);
        }
        smax[n-1] =r*arr[n-1];
        for(int i=n-2;i>=0;i--){
            smax[n-1] = Math.max(smax[i+1],r*arr[i]);

        }
        int ans = Integer.MIN_VALUE;

        for(int i=1;i<n-1;i++){
            ans = Math.max(ans,pmax[i-1]+q*arr[i]+smax[i+1]);
        }
        return ans;
    }

}
