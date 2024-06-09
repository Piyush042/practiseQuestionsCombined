public class digitSum3 {
  static int findSum (int n ){
      int num =0;
      for (int i = 100; i <= 999; i++) {
          int digitsum = 0;
          num =i;
          while(num>0){
              int digit = num%10;
              digitsum += digit;
              num /= 10;
          }
          if(digitsum == n){
              return i;
          }
      }
      return -1; // Return -1 if no such number is found
  }



    public static void main(String[] args) {
        int n = 8;
        System.out.println(findSum(n));

    }
}
