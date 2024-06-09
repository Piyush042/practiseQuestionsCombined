import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class xorInSubArrays {
    public static int solve(int[] A, int B) {
        int len = A.length;
        ArrayList<Integer> list = new ArrayList<>();
        int count =0;
        for(int i =0;i<len;i++){
            int n =0;
            for(int j =i;j<len;j++){
                n = n^j;

                if(n ==B){
                    count++;
                }
            }
        }
        return count;
    }

    int withmap(int[] A, int B){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<A.length;i++){
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }
        int count = 0;
        int xr = 0 ;
        for(int i =0;i<A.length;i++){
            xr = xr^A[i]; //current xr value;
            int x = xr^B; //curr x value that should be xor to get B
            int val =  map.get(x);
            count += val;
        }
        return count;
    }
    int[] findTwoElement(int arr[], int n) {
        // code here

        HashMap<Integer,Integer> map = new HashMap<>();
        int missing =0;
        int repeating = 0;
        int sum =0;
        for(int i =0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            sum += arr[i];
        }
        int max = Collections.max(map.values());
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1) {
                repeating = entry.getKey();
            }
            break;
        }
        sum = sum - repeating;
        int sumreq = (max*(max+1))/2;
         int misssing = sumreq - sum;
         return new int[]{repeating,misssing};
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 6, 4};
        int B = 6;
        System.out.println(solve(A,B));
    }
}
