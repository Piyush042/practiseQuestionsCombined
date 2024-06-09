import java.util.Arrays;

public class solvePuzzle {
    static int[] findValues(int[] arr, int k , int n ){
        int sum =  0;
         int start = 0;
         int[] res = new int[2];
          for (int i= 0;i<n;i++){
              sum += arr[i];
              while(sum>k && start<= i){
                  sum -= arr[start];
                  start++;

              }

              if(sum == k){
                 res[0] = start+1;
                 res[1] = i+1;
                 return res;
              }
          }
          return res;
    }

    public static void main(String[] args) {
        int n = 10;
        int k = 15;
        int[] arr = {5,3,7,14,18,1,18,4,8,3};

        System.out.println(Arrays.toString( findValues(arr,k,n)));

    }

}
