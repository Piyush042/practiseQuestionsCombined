import java.security.SecureRandom;
import java.util.Scanner;

public class floatToInt {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String c = sc.next();
//        System.out.println(c);
//
//        float value = Float.parseFloat(c);
//
//        System.out.println(value);
        char c = '8';
          //int n = Character.getNumericValue(c);
        int n = c-'0';
        //System.out.println(n);

        float val = 8.676f;
        val = val*100;
        int conv =(int) val;
        val = (float)conv/100;

        //System.out.println(val);
        String s = "4.56";
        float value = Float.parseFloat(s);
        System.out.println(value);
        String floatVal = String.valueOf(value);
        System.out.println(floatVal);
        char[] arr = {'c','b','a'};
        //String.valueOf() - converts any value in string form of that value;
        // number - '0' converts char into number;
        //number + '0' converts num to char;
        

    }
}
