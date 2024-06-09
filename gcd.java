import java.util.Scanner;


import static java.util.Collections.swap;

public class gcd {
    int gcd(int a, int b){
        return a%b==0?b:gcd(b, a%b);
    }
    int count(int n , int m){
        if(n==1|| m==1){
            return 1;

        }
        return count(n-1,m) + count(n,m-1);
    }
    static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int l=0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l)!= s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }

    static void superset(String s, int i , String curr){
        if(i == s.length()){
            System.out.println(curr);
            return;
        }
        superset(s,i+1,curr+s.charAt(i));
        superset(s,i+1,curr);
        System.out.println(curr);
    }
    void permute(String s, int l , int r){
        if(l==r){
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++){
//            s= swap(s,l,i);
            permute(s,l+1,r);
           //s= swap(s,l,i);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }

}
