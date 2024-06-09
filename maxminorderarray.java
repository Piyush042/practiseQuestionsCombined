import java.util.ArrayList;
import java.util.Arrays;

public class maxminorderarray {
    public static void main(String[] args) {
        int n = 7;
        long[] arr = {7,1,2,3,4,5,6};
        System.out.println(alternateSort(arr,n));
    }

    static ArrayList<Long> alternateSort(long arr[] , int N)
    {

        // Your code goes here
        Arrays.sort(arr);

        ArrayList<Long> list = new ArrayList<>();
        int i =0;
        int j = N-1;
        while(i<=j){
            list.add(arr[j]);
            j--;
            if(list.size()<N) {
                list.add(arr[i]);
                i++;
            }


        }

        return list;
    }
}
