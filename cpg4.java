import static java.util.Collections.swap;

public class cpg4 {
    static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void BuubleSort(int[] arr, int n){
        boolean swapped =false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    swap(arr,j+1,j);
                    swapped = true;

                }
                if(!swapped){
                    break;
                }
            }

        }
    }


}
