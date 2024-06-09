public class c2 {
    static int converter(int n ){
        int ans=0;
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        int index =0;
        for(int i=binary.length()-1;i>=0;i--){
            if(binary.charAt(i)=='0'){
                ans += (int) Math.pow(2,index); //since binary string is 2 to the power index * that position value gives int

            }
            index++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n =10;
        System.out.println(converter(n));
    }
}
