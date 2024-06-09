import java.util.HashSet;
import java.util.Scanner;

public class Twounrepeated {
    static void get2NonRepeating(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (!set.contains(j)) {
                set.add(j);
            } else {
                set.remove(j);
            }
        }
        for(int s:set){
            System.out.println(s+ " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        get2NonRepeating(arr, n);

    }
}
