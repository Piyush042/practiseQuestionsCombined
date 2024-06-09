public class findHOrse {
    static int find(int[] arr, int n , int k){
        int maxcount =0;
        int sum = 0;
        int start = 0;
        for(int i =0;i<n;i++){
            sum += arr[i];
            while(sum>=k && start<= i){
                sum-= arr[start];
                start++;

            }
            maxcount= Math.max(maxcount,i-start+1);
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int[] arr = {10,90,70,20,90,60,40,60,70,75};
        int n = 10;
        int k =100;
        System.out.println(find(arr,n,k));
    }



}
