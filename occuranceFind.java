import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class occuranceFind {
    static List<List<Character>> maxMinOccurance(String s){
        int[] charcount = new int[256];
        for(int i=0;i<s.length();i++) {
            charcount[s.charAt(i)]++;
        }

        char first = s.charAt(0);

        char max = first;
        char min = first;
        List<Character> maxlist = new ArrayList<>();
        List<Character> minlist = new ArrayList<>();


        for(int i=0;i<s.length();i++){

            if(charcount[s.charAt(i)]>charcount[max]){
                max = s.charAt(i);
                maxlist.clear();
                maxlist.add(max);
            } else if (charcount[s.charAt(i)]==charcount[max]) {
                maxlist.add(s.charAt(i));
            }
            if(charcount[s.charAt(i)]<charcount[min]){
                min = s.charAt(i);
                minlist.clear();
                minlist.add(min);
            } else if (charcount[s.charAt(i)]==charcount[min]) {
                minlist.add(s.charAt(i));
            }
        }
        List<List<Character>> result = new ArrayList<>();
        result.add(maxlist);
        result.add(minlist);


        return result;
    }

    public static void main(String[] args) {
        String s = "ssionppproiugogkkkko";
        System.out.println( maxMinOccurance(s));;

    }
}
