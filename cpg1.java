import java.util.Scanner;

public class cpg1 {
    static String removehash(String s, int l) {

        String modified ="";
        int hash = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != '#') {
                modified += s.charAt(i);
            } else {
                hash += 1;
            }

        }
        for (int i = 0; i < hash; i++) {
            modified = '#'+ modified;
        }
        return modified;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(removehash(s,l));
    }

}

