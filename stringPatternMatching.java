import java.util.Scanner;

public class stringPatternMatching {
    static String checkaPattern(String string, String pattern) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < string.length()) {
            if (i + pattern.length() <= string.length() && string.substring(i, i + pattern.length()).equals(pattern)) {
                for(int j=0;j<pattern.length();j++)result.append("+");
                i += pattern.length();
            } else {
                result.append(string.charAt(i));
                i++;
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
//        int n = sc.nextInt();
//        StringBuilder str = new StringBuilder();
//        for(int i=0;i<n;i++){
//            str.append((sc.next().charAt(0)));
//        }
        String string = sc.next();

        String pattern = sc.next();

        System.out.println(checkaPattern(string,pattern));
    }
}
