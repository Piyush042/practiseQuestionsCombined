import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class sumPairs {
    static List<List<Integer>> sumUniquePairs(int[] arr, int n, int k){
        HashMap<Integer, Integer> map  = new HashMap<>();
        List<List<Integer>>  result = new ArrayList<>();
        for(int i=0;i<n;i++){

            int sumComplement = k - arr[i];
            if(map.containsKey(sumComplement)){
                List<Integer> list1 = new ArrayList<>();
                list1.add(sumComplement);
                list1.add(arr[i]);

                result.add(list1);
            }

                map.put(arr[i],i);
        }
        return result;
    }
    static List<List<Integer>> allPairs(int[] arr, int n , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0;i<n;i++ ){
            int sum = k - arr[i];
            if(map.containsKey(sum)){
                int frequency = map.get(sum);
                List<Integer> list = new ArrayList<>();
                list.add(sum);
                list.add(arr[i]);
                for(int j=0;j<frequency;j++){

                    result.add(list);
                }
            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        return result;
    }
    static int countPairs(int[] arr, int n , int k){
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        int count =0;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == k){
                count++;
                left++;
                right--;
            }
            if(sum>k)right--;
            if(sum<k)left++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int n =4;
        int k = 2;

//        List<List<Integer>>resultList = new ArrayList<>();
//        resultList = allPairs(arr,n,k);;
//        for(List<Integer> elements : resultList){
//            System.out.println(elements);
//        }
        System.out.println(sumUniquePairs(arr,n,k));
    }
}
