public class diffCount {
    static int find(int[] arr,int n){
        boolean isSame = true;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] != arr[i + 1]) {
                isSame = false;
                break;
            }
        }
        int count = 1;
        if (isSame)return arr.length;
        else{

            for(int i=0;i<n-1;i++){
                if(arr[i]!= arr[i+1]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,1,1};
        int n = arr.length;
        System.out.println(find(arr,n));
    }
}
