import java.util.Arrays;
import java.util.Scanner;

public class split {
    static String spmethod(String s){
//        String[] arr = s.split("[^a-zA-Z0-9]");//s.replaceAll
//        return Arrays.toString(arr);
        String[] arr = s.split("\\+");
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(spmethod(s));
    }
}
