import java.util.Scanner;

public class marvaloring {
     static int findMax(int[] arr, int n, int p, int q, int r){
        int[] pmax = new int[n];
        int[] smax = new int[n];
        pmax[0] = p*arr[0];
        for(int i=1;i<n;i++){
            pmax[i] = Math.max(p*arr[i],pmax[i-1]);
        }
        smax[n-1] = r*arr[n-1];
        for(int i=n-2;i>=0;i--){
            smax[i] = Math.max(r*arr[i],smax[i+1]);
        }

        int ans =0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,pmax[i]+q*arr[i]+smax[i]);
        }
        return ans;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr,n,p,q,r));


     }
}

