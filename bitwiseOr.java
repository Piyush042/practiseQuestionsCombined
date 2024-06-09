import java.util.HashSet;

public class bitwiseOr {
    static int orVlaue(int[] nums){
        int sum =0;
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int or =0;
            for(int j=i;j<n;j++){
                or |= nums[j];

            }
            set.add(or);
        }
        return set.size();
    }

    public static void main(String[] args) {

    }
}
