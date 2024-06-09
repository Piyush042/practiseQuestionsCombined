import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class findLargestNo {
    static int findLargestdiff(int[] arr){
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map  = new HashMap<>();
        for(int i =0;i<n;i++ ){
            map.put(arr[i],i);
        }
        int max = Collections.max(map.keySet());
        int index = map.get(max);

        for(int i=0;i<index;i++){
            smallest = Math.min(smallest,arr[i]);
        }
        return max-smallest;

    }

    public static void main(String[] args) {
        int[] arr = {-3,-5,1,6,-7,7,4,-11};
        System.out.println(findLargestdiff(arr));
    }
}
