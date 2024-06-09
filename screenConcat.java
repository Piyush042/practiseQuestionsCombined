import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class screenConcat {
    static void check(String[] strs, String target){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i =0;i<strs.length-1;i++){

            int count =0;
           for(int  j = i+1;j<strs.length;j++){
               String curr = strs[i] + strs[j];
               System.out.println(curr);
               count ++;
               map.put(curr, count);
           }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
           // System.out.println(entry.getKey());
          //  System.out.println(entry.getValue());
        }

    }

    public static void main(String[] args) {
        String[] str = {"soft","so","ware","s"};
       // System.out.println(check(str,"softwares"));
        check(str,"soft");
    }

}
