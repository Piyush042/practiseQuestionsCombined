import java.util.ArrayList;
import java.util.List;

public class nextPermutation extends Bubblesort {
    static void reverse(int[] arr,int l, int r){
        while (l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    static ArrayList<Integer> nextPermutation(int N, int[] arr){
        // code here
        int breakPoint = -1;
        for(int i =N-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                breakPoint = i;
                break;
            }
        }
        if(breakPoint == -1)reverse(arr,0,N-1);
        else {
            for (int i = N - 1; i >= breakPoint; i--) {
                if (arr[i] > arr[breakPoint]) {
                    swap(arr, i, breakPoint);
                }
            }
            reverse(arr, breakPoint, N - 1);
        }
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int digit: arr){
            arrlist.add(digit);
        }
        return  arrlist;

    }
}
