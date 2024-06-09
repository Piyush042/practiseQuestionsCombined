import java.util.ArrayList;
import java.util.Scanner;

public class day2shift1 {
    static ArrayList<Integer> findMax(ArrayList<Integer> arr, int k){

        int n = arr.size();
        ArrayList<Integer> res = new ArrayList<>();
        int l =0;
        int r = k;
        while(r<=n){
            int max = Integer.MIN_VALUE;
            for(int i=l;i<r;i++){
                int cur = arr.get(i);
                if(cur>max)max = cur;
            }
            res.add(max);
            r++;
            l++;

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

            while (sc.hasNextInt()){

                arr.add(sc.nextInt());
            }

        System.out.println(findMax(arr,2));
    }
}
