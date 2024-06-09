public class split01 {
    static int split01(String s ){
        int count =0;
        int count0 = 0;
        int n = s.length();
        int count1= 0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='0'){
               count0++;
           }
           else if(s.charAt(i)=='1'){
               count1++;
           }

           if(count0==count1){
               count++;
               count0 =0;
               count1 = 0;

           }
       }
      if(count ==0||count0!=0||count1!=0)return -1;
      return count;
    }

    public static void main(String[] args) {
        String s = "0111100010";
        System.out.println(split01(s));
    }
}
