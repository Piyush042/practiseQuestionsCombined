import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    static void mergesortfun(int[] arr, int l, int r){
        if(l>=r)return;
        int mid = l+(r-l)/2;
        mergesortfun(arr,l,mid);
        mergesortfun(arr,mid+1,r);
        merger(arr,l,r,mid);
     }

     static void merger(int[] arr, int l, int r, int mid){
        int index1 = l;
        int index2 = mid+1;
        int[] mergerarr = new int[r-l+1];
        int x =0;
        while(index1<= mid && index2 <= r){
            if(arr[index1]<arr[index2]){
                mergerarr[x++]=arr[index1++];
            }
            else{
                mergerarr[x++] = arr[index2++];
            }
        }
        while(index1<=mid){
            mergerarr[x++] = arr[index1++];
        }
         while(index2<=r){
             mergerarr[x++] = arr[index2++];
         }

         for (int i=0,j=l;i<mergerarr.length;i++,j++){
              arr[j] = mergerarr[i];
         }

     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int r = n-1;
        mergesortfun(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }
}
