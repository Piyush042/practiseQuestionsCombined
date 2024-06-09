public class c8 {
    static int findValue(int n, int r){
        int sum =0;
        while(r>0){
            int redeemed = n;
            while(redeemed>0) {
                sum += redeemed % 10;
                redeemed/= 10;
            }
            r--;
        }
        System.out.println(sum);
        int finalresult = 0;
        while (sum>0){
            finalresult += sum%10;
            sum /= 10;
        }
        return finalresult;
    }
    static int reverseDigit(int n){
        int sum =0;
        while (n>0){
            int indexValue = n%10;
            sum = 10*sum + indexValue;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 1234;
        int r = 2;
        System.out.println( reverseDigit(n));;
    }
}
