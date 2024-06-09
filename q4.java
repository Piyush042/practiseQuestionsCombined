import java.nio.channels.FileLock;
import java.util.Scanner;

public class q4 {
    static void findVal(String[][] str,int n ){
      float sum =0;
      float val = 0;
      for(int i=0;i<n;i++){
        val = Float.parseFloat(str[i][2])* Float.parseFloat(str[i][1]);
        sum += val;
      }
      float avg = sum/3;
        System.out.println(avg);
      float maxSum =0;
      int index = 0;
      for(int i =0;i<n;i++){
          String fruit = str[i][0];
          float currSum =0;
         for(int j = 0;j<n;j++){
            if(fruit.equals(str[j][0])){
               float sum1 = Float.parseFloat(str[j][2])* Float.parseFloat(str[j][1]);
               currSum += sum1;
               if(currSum>maxSum){
                   maxSum = currSum;
                   index = j;
               }
            }
         }
      }
        System.out.println(str[index][0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] str = new String[n][3];
        for(int i = 0;i<n;i++){
            str[i][0] = sc.next();
            float val1 = sc.nextFloat();
            str[i][1] = String.valueOf(val1);
            float val2 = sc.nextFloat();
            str[i][2] = String.valueOf(val2);
        }
        findVal(str,n);

    }
}
