import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class subArrays {
    public static List<List<Integer>> findAllSubarrays(int[] arr) {
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) { //1 2 3
            List<Integer> subarray = new ArrayList<>();
            for (int end = start; end < arr.length; end++) {// 1 12 123 2 23 3
                subarray.add(arr[end]); //list k case me nya change me purana v change ho jata h...
                subarrays.add(new ArrayList<>(subarray));
            }
        }

        return subarrays;
    }
    static int findDistinct(List<List<Integer>> res){
        HashSet<Integer> set = new HashSet<>();
        for(List list: res){
            int sum =0;
            for (Object o : list) {
                sum |= (int) o;
                set.add(sum);
            }


        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(findDistinct(findAllSubarrays(arr)));;
    }
}
