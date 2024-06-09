import java.util.ArrayList;
import java.util.Scanner;

public class inputInNxt {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        while(sc.hasNext()){

            String s = sc.next();
            double d = sc.nextDouble();
            double t = sc.nextDouble();
            System.out.println(s+" "+d+" "+t);
        }
    }
}
