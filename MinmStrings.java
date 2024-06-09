import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MinmStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String words = sc.nextLine();
        String[] wordarr = words.split(" ");
        System.out.println(findMin(target,wordarr));

    }

    private static int findMin(String target, String[] wordarr) {
        HashSet<String> set = new HashSet<>();
        int[] dp = new int[target.length()+1]; //dp array defines minimum no of words
        //required to make upto that particular index in target...
        for(int i=0;i<wordarr.length;i++){
            set.add(wordarr[i]);
        }
        Arrays.fill(dp,Integer.MAX_VALUE);

        dp[0] =0;
        for(int i=1;i<=target.length();i++){
            for(int j=0;j<=i;j++) {
                String str = target.substring(j,i);
                if(set.contains(str) && dp[j]!= Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[j]+1,dp[i]);
                }
            }
        }
        return dp[target.length()];

    }
}
