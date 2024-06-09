import java.util.HashMap;
import java.util.Map;

public class makeShoePairs {
    static int findPairs(String[] s){
        HashMap<String,Integer> map = new HashMap<>();
        for(String s1:s){
            map.put(s1,map.getOrDefault(s1,0)+1);
        }
        int pair =0;
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            if(key.endsWith("L")){
                String toFind = key.charAt(0)+"R";
                if(map.containsKey(toFind)){
                    pair += Math.min(map.get(toFind),value);
                }
            }
            if(key.endsWith("R")){
                String toFind = key.charAt(0)+"L";
                if(map.containsKey(toFind)){
                    pair += Math.min(map.get(toFind),value);
                }
            }
        }
        return pair/2;
    }

    public static void main(String[] args) {
         String[] s ={"4L","5L","4R","5R","7L","6R"};
        System.out.println(findPairs(s));
    }

}
