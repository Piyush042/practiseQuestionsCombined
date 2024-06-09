import java.util.*;

public class collectionsmax {
    static void findMax(char[] arr){

        HashMap<Character,Integer> map = new HashMap<>();
        for ( char j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        int max = Collections.max(map.values());
        ArrayList<Character> maxList = new ArrayList<>();

        int min = Collections.min(map.values());
        ArrayList<Character> minList = new ArrayList<>();

        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue() == max)maxList.add(entry.getKey());
            if(entry.getValue()== min)minList.add(entry.getKey());
        }
        System.out.println(maxList +" Occurring: "+max+" times" );
        System.out.println(minList +" Occurring: "+min+" times" );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] carr = s.toCharArray();
        findMax(carr);
    }

}
