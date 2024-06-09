import java.util.ArrayList;
import java.util.HashSet;

public class findSubarray {
    static int subarrays(int[] arr){
        //ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                //ArrayList<Integer> list1 = new ArrayList<>();
                int sum =0;
                for(int k =i;k<=j;k++){
                    sum |= arr[k];
                }
                //res.add(list1);
                set.add(sum);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(subarrays(arr));
    }
}
