public class Lcp {
    static String longestprefix(String[] s, int n){
        int first = s[0].length();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<first;i++){
            char c = s[0].charAt(i);
            for(int j=1;j< n;j++){
                if(s[j].length()<=i || s[j].charAt(i) != c ){
                    return res.isEmpty() ?"-1": res.toString();
                }
            }
            res.append(c);
        }
        return res.isEmpty() ? "-1":res.toString();
    }

    public static void main(String[] args) {
        String[] s = {"geeksforgeeks", "geeks", "geek", "geezer" };
        
        System.out.println(longestprefix(s, 4));

    }
}
