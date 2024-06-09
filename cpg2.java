import java.util.Scanner;

public class cpg2 {
    static StringBuilder reduceSize(String s){
        StringBuilder s2 = new StringBuilder();
        int count =1;
        char prevChar = s.charAt(0);
        for(int i=1;i<s.length();i++){
            char curChar = s.charAt(i);
            if(prevChar == curChar){
                count++;

            }
            else {
                s2.append(prevChar);
                s2.append(count);
                prevChar = curChar;
                count =1;
            }

        }
        s2.append(prevChar);
        s2.append(count);
        return s2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reduceSize(s));
    }
}
