public class Bubblesort {
    static  void swap(int[] arr, int i , int j){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }
    static int[] bubbleSort(int[] arr, int n){
        boolean isSwapped = false;
        for(int i=0;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j+1, j);
                    isSwapped = true;
                }
            }
            if(!isSwapped)break;
        }
        return arr;
    }
}
