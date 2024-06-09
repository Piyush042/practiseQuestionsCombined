import java.util.HashMap;

public class subArraySum {
    void maxSubArray(int[] arr, int target){
        int currsum =0;
        int start =0;
        int end =-1;
        HashMap<Integer,Integer> map = new HashMap<>();
         for (int i =0;i<arr.length;i++){
             currsum += arr[i];
             if(currsum-target == 0){
                 start =0;
                 end = i;
                 break;
             }
             else if(map.containsKey(currsum-target)){
                 start = map.get(currsum-target)+1;
                 end = i;
             }

                 map.put(currsum,i);



         }
         if(end!=-1){
             System.out.println(start+","+end);
         }
         else{
             System.out.println("not found");
         }
    }
}
