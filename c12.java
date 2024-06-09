import java.util.HashMap;
import java.util.Map;

public class c12 {
    static char findFirstOdd(char[] arr, int n ){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],  map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() %2 !=0){
               return entry.getKey();

            }
        }
        return '0';
    }

    public static void main(String[] args) {
        char[] arr = {'a','r','g','b','b','b','y'};
        int n = arr.length;
        System.out.println(findFirstOdd(arr,n));
    }
}
