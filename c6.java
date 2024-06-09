public class c6 {
    static int findvalue(int n){
        int ans =1;
        while(n>0){
            int index = n%10;
            ans *= index;
            n = n/10;

        }
        return ans;
    }

    public static void main(String[] args) {
        int n= 5244;
        System.out.println(findvalue(n));
    }
}
