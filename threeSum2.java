import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class threeSum2 {
    static List<List<Integer>> threeSum(List<Integer> list, int target){
        Collections.sort(list);
        List<List<Integer>> res = new ArrayList<>();
        int n = list.size();
        for(int i=0;i<n-2;i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = list.get(i) + list.get(l) + list.get(r);
                if (sum == target) {
                    res.add(Arrays.asList(i, l, r));
                    l++;
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}
