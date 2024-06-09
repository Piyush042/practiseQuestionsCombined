public class masSubArray {
    static int maxLength(int[] arr, int n){
        int curSum = 0;
        int maxSum =Integer.MIN_VALUE;
        for(int i=-0;i<n;i++){
            curSum = curSum+arr[i];
            if(curSum>maxSum){
                maxSum = curSum;
            }
            if(curSum<0){
                curSum = 0;
            }
        }
        return maxSum;
    }
}
