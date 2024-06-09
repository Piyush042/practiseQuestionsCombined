public class anagramCode {
    static boolean checkAnagram(String s, String s2 ){
        if(s.length()!= s2.length())return false;
        int[] charcount = new int[256];
        for(int i=0;i<s.length();i++){
            charcount[s.charAt(i)]++;
            charcount[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(charcount[i]!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abacdd";
        String s2 = "aabcde";
        System.out.println(checkAnagram(s,s2));
    }
}
