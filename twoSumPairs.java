import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class twoSumPairs {
    static ArrayList<List<Integer>> findPairs(int[] arr , int target){

        HashMap<Integer, Integer> map = new HashMap<>();



        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int k : arr) {
            int complement = target - k;
            if (map.containsKey(complement)) {
                int freq = map.get(complement);
                ArrayList<Integer> list = new ArrayList<>();
                list.add(complement);
                list.add(k);
                for (int j = 0; j < freq; j++) {
                    res.add(list);
                }

            }
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int k =2;
        System.out.println(findPairs(arr,k));
    }
}
