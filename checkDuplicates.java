import java.util.*;

public class checkDuplicates {
    static void countDuplicates(char [] chararr){
        int n = chararr.length;
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (char j : chararr) {
            map.put(j, map.getOrDefault(j, 0) + 1);

        }
//        for(Map.Entry<Character,Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        }
        Comparator<Map.Entry<Character,Integer>> com= (entry1,entry2)->entry1.getValue().compareTo(entry2.getValue());
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,com);
        for(Map.Entry<Character,Integer>entry: list){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }

    public static void main(String[] args) {
        String s = "ABBSCDSD";
        char[] chararr = s.toCharArray();
        countDuplicates(chararr);
    }

}
