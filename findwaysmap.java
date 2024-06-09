import java.util.HashMap;

public class findwaysmap{

    public static int countSubarraysWithSum(int[] arr, int target) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == target)
                count++;

            if (map.containsKey(sum - target))
                count += map.get(sum - target);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int target = 7;

        int count = countSubarraysWithSum(arr, target);
        System.out.println("Count of subarrays with sum " + target + ": " + count);
    }
}
