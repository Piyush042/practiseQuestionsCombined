import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation2 {
    String swap(String s, int i, int j) {
       char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

    List<String> permute(String s, int l, int r){
        ArrayList<String> arr = new ArrayList<>();

        if(l==r){
            arr.add(s);
            return arr;
            }
        for(int i=l;i<=r;i++){
            s= swap(s,l,i);
            permute(s,l+1,r);
            s= swap(s,l,i);
        }
      return arr;
    }
     public List<String> find_permutation(String S) {
        // Code here

        int l =0;
        int r = S.length()-1;
        return permute(S,l,r);


    }
}
