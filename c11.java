import java.util.HashMap;
import java.util.Map;

public class c11 {
    static int singleOccurance(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        int ans =0;
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){

            int frequency = entry.getValue();
            if(frequency%2 != 0){
                ans = entry.getKey();
            }
        }
        return ans;
    }
     

    public static void main(String[] args) {
        int[] arr = {2,3,2,3,3,4,5,4,5};
        System.out.println(singleOccurance(arr));
    }
}
