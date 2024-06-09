public class checkForMiddle {
    static boolean check(String s, String pat, int l, int r) {
        int mid = l + r / 2;
        if (r % 2 == 0) {
            if (s.substring(mid - 1, mid + 2).equals(pat) || s.substring(mid - 2, mid + 1).equals(pat)) return true;

        } else {
            if (s.substring(mid - 1, mid + 2).equals(pat)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "AXYZBBB";
        String pat = "XYZ";
        int l = 0;
        int r = s.length();
        boolean res = check(s,pat,l,r);
        System.out.println(res);

    }


}
