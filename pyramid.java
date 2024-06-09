import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pyramid {
    static int[] makeBase(int n){
        int[] arr = new int[n*(n+1)/2];
        arr[0] = 6;
        arr[1] = 28;
        int diff = 22;
        for(int i=2;i< arr.length;i++){
            diff += 16;
            arr[i] = arr[i-1] +diff;

        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
    static void Print(int[] arr, int n ){
        //int m = n*(n+1)/2;
        int index =0;
            for(int i=0;i<n;i++){
                for(int j =0;j<=i;j++){
                    System.out.print(String.format("%05d",arr[index])+" ");
                    index++;
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(makeBase(n),n);
    }

}
