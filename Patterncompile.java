import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterncompile {
    static boolean check(String s,String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
           String s = "abcabdb";
    }
}
