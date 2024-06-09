public class permutation {
    static void powerSet(String s,int i,String cur ){

        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        powerSet(s,i+1, cur+s.charAt(i));
        powerSet(s,i+1,cur);
    }
    static void permute(String s, int l, int r){
        if(l==r){
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++){
            //swap(s,l,i);
            permute(s,l+1,r);
           // swap(s,l,i);
        }
    }

}
