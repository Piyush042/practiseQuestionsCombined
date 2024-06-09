import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class subArraysum {
    static List<List<Integer>> twoSum (int[] arr , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for (int k : arr) {
            int sum = target - k;

            if (map.containsKey(sum)) {
                List<Integer> list = new ArrayList<>();
                list.add(sum);
                list.add(k);
                int frequency = map.get(sum);
                for (int j = 0; j < frequency; j++) {
                    result.add(list);
                }

            }
            map.put(k, map.getOrDefault(k, 0) + 1); // apne se left wale ka pair bnana hota h
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int sum =2;
        System.out.println(twoSum(arr,sum));
    }

}
