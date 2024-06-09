public class searchinrotatedarr {
    static int find(int[] arr, int key ){
        int n = arr.length;
        int l =0;
        int r = n-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==key)return mid;
            if(arr[l]<arr[mid]){
                if(key>=arr[l]&& key<arr[mid]){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
            else{
                if(key>arr[mid] && key<=arr[r] ){
                    l = mid+1;

                }
                else{
                    r= mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8,9,10,2,3,4,5,6,7};
        int key = 10;
        System.out.println(find(arr,key));
    }
}

