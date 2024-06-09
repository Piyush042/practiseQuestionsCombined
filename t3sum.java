import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t3sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // Skip duplicates for the second element
                   while (j<k && nums[j] == nums[j+1])j++;
                    // Skip duplicates for the third element
                    while (j < k && nums[k] == nums[k - 1])k--;

                    j++;
                    k--;
                }
                else if (sum > 0) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
}
