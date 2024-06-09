public class kthFactor{
    static boolean isFactor(int n, int i ){
        if(n%i==0)return true;
        return false;
    }
   static int findkthFactor(int n, int k  ){
        int count =0;
       for(int i=1;i<= n;i++){
           if(isFactor(n,i))count++;
           if(count == k)return i;
       }
       return 1;
   }

    public static void main(String[] args) {
        int n = 12;
        int k =4;
        System.out.println(findkthFactor(n,k));
    }
}
