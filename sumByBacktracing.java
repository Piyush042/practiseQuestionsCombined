import java.util.ArrayList;

public class sumByBacktracing {
    public static int findTargetSumWays(int[] nums, int target) {
        int index = 0;
        int curSum = 0;
        return util(nums,target,index,curSum);
    }
    static int util(int[] nums, int target, int index, int currsum){
        if(index == nums.length)return currsum == target? 1:0;
        int plusways = util(nums,target,index+1,currsum+nums[index]);
        int minusways = util(nums,target,index+1,currsum-nums[index]);
        return plusways + minusways;

    }



    // another try
    public static ArrayList<ArrayList<Integer>> findTargetSumWay(int[] nums, int target) {
        int sum =0;
        int count =0;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i =0;i<nums.length;i++){
            sum = 0;
            for(int j =i;j< nums.length;j++){
                sum += nums[j];
                if(sum == target) {
                    ArrayList<Integer> list = new ArrayList<>();
                    for(int k=i;k<=j;k++){
                        list.add(nums[k]);
                    }
                    res.add(list);
                    count++;

                }
            }
        }
        return res;
    }
    public static int findTargetSumsWay(int[] nums, int target) {
        int count = 0;
        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < nums.length) {
            sum += nums[right];

            while (left <= right && sum > target) {
                sum -= nums[left];
                left++;
            }

            if (sum == target) {
                count++;
            }

            right++;
        }

        return count;
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int target = sc.nextInt();
//        System.out.println(findTargetSumWay(arr,target));
        int[] arr = {3,4,-7,1,3,3,1,-4};
        int target = 7;
        System.out.println(findTargetSumWay(arr,target));;
    }

}
