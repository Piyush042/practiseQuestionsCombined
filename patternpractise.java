public class patternpractise {
    public static boolean searchPattern(String str, String pat) {
        // code here
        int s = str.length();
        int p = pat.length();
        int i=0;
        while (i<s){
            if(i+p<=s && str.substring(i,i+p).equals(pat)){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "pq";
        String pattern = "q";
        System.out.println(searchPattern(str,pattern));
    }
}
