import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class twoSumbyList {
    static List<Integer> twoSum(List<Integer> list, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<list.size();i++){
            int curSum = target - list.get(i);
            if(map.containsKey(curSum)){

                return Arrays.asList(map.get(curSum),i);
            }
            else{
                map.put(list.get(i),i );
            }
        }
       return new ArrayList<>();
    }
}
