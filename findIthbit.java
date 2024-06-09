public class findIthbit {
    static int find(int n,int k ){
        int bit = ((n & (1 << (k - 1))) >> (k - 1));
        return bit;
    }
    static int set(int n,int k ){
        int mask = 1<<k-1;
        int bit = n|mask;
       return bit;
    }
    static int findtoChange(int n, int m){
        int val = n^m;
        int count =0;
        while (val!=0){
            val = val&(val-1);
            count ++;
        }
        return count ;
    }
    public static void main(String[] args) {
        int n = 4;
        int k = 5;
//        System.out.println(find(n,k));
//        System.out.println(set(n,k));
        System.out.println(findtoChange(n,k));
    }
}
