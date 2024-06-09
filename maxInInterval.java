public class maxInInterval {
    static int maxSum(int[] arr, int d){
        int n = arr.length;
        int i =0;

        int sum =0;
        while (i<n){
            int max = Integer.MIN_VALUE;


                for (int j = i;j<Math.min(i+d,n);j++){
                    int curr = arr[j];

                    if(curr>max)max= curr;

                }
                sum += max;


            i += d;


        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        int d=2;
        System.out.println(maxSum(arr,d));
    }
}
