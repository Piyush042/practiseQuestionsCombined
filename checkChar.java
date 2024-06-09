public class checkChar {
    public static void main(String[] args) {
        String s = "abx09_";
        int count =0;
        for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))) {
           count++;
       }
       }
    }
}
