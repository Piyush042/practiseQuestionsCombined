import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class maxminOccurance {
    static void findMaxMinchar(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int minCount = Integer.MAX_VALUE;
        int maxCount = Integer.MIN_VALUE;
        char minChar = 0;
        char maxChar = 0;

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }

        for (char key : map.keySet()) {
            int frequency = map.get(key);

            if (frequency > maxCount) {
                maxCount = frequency;
                maxChar = key;
            }
            if (frequency < minCount) {
                minCount = frequency;
                minChar = key;
            }
        }

        System.out.println("Maximum Occurring Character: " + maxChar);
        System.out.println("Minimum Occurring Character: " + minChar);

    }

    static void findMaxMincharlist(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int minCount = Integer.MAX_VALUE;
        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }

        List<Character> minChars = new ArrayList<>();
        List<Character> maxChars = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxCount) {
                maxCount = frequency;
                maxChars.clear(); // Clear previous max characters
                maxChars.add(key); // Add new max character
            } else if (frequency == maxCount) {
                maxChars.add(key); // Add character if its frequency matches max frequency
            }

            if (frequency < minCount) {
                minCount = frequency;
                minChars.clear(); // Clear previous min characters
                minChars.add(key); // Add new min character
            } else if (frequency == minCount) {
                minChars.add(key); // Add character if its frequency matches min frequency
            }
        }

        System.out.println("Maximum Occurring Characters: " + maxChars);
        System.out.println("Minimum Occurring Characters: " + minChars);
    }

    public static void main(String[] args) {
        String s = "ppasssionro";
        findMaxMinchar(s);
    }

}
