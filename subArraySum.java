import java.util.ArrayList;
import java.util.List;

public class subArraySum {
    public static List<List<Integer>> findSubarraysWithSum(int[] arr, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > targetSum && start<=end) {
                currentSum -= arr[start];
                start++;
            }


            if (currentSum == targetSum) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(arr[i]);
                }
                result.add(subarray);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int targetSum = 7;
        List<List<Integer>> subarrays = findSubarraysWithSum(arr, targetSum);
        System.out.println(subarrays);
    }
}
