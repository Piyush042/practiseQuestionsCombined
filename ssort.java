public class ssort extends Bubblesort{
    static void selction(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min != i){
                swap(arr,i,min);
            }
        }
    }
}
