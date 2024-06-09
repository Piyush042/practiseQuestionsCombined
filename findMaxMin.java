import java.util.*;

public class findMaxMin {

        public static char[] maxMinOccurringCharacters(String str) {
            Map<Character, Integer> charCount = new HashMap<>();

            // Counting the frequency of each character
            for (char c : str.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            char maxChar = ' ';
            char minChar = ' ';
            int maxCount = Integer.MIN_VALUE;
            int minCount = Integer.MAX_VALUE;

            // Finding the maximum and minimum occurring characters
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                char c = entry.getKey();
                int count = entry.getValue();

                if (count > maxCount) {
                    maxCount = count;
                    maxChar = c;
                }
                if (count < minCount) {
                    minCount = count;
                    minChar = c;
                }
            }

            return new char[]{maxChar, minChar};
        }






    public static void main(String[] args) {
        String s = "passsionppro";
        find(s);
    }

    static void find(String s){
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int maxValue = Collections.max(map.values());
        int minValue = Collections.min(map.values()); // for key map.keySet();
        List<Character> maxchars = new ArrayList<>();
        List<Character> minchars = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == maxValue)maxchars.add(entry.getKey());
            if(entry.getValue()== minValue)minchars.add(entry.getKey());
        }
        System.out.println("Maximum characters: " + maxchars + ", Occurrence: " + maxValue);
        System.out.println("Minimum characters: " + minchars + ", Occurrence: " + minValue);

    }

}
