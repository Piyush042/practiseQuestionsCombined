import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class charToInt {

        public static void main(String[] args) {
            char ch = '5';
            int n = Character.getNumericValue(ch);
            // System.out.println(n);
            //System.out.println((int) ch);
            int intValue = ch - '0'; //char to int
            char x = 5 +'0';  //int to char
            //System.out.println(x);
            //char to string
            String s2 = String.valueOf(ch);
            String s1 = Character.toString(ch);
            System.out.println(s2);
            int ascii = 50;
            int newval = ascii + 2;
            float r = 6.03F;
           // System.out.println(r);

           // System.out.println("Integer value of " + ch + " is " + newval);
        }


}
