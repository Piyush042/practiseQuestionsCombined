import java.util.Arrays;

public class separate567 {
    static void swap(int l ,int r , int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    static int[] sortOccurances(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while (mid<=right) {
            switch (arr[mid]) {
                case 5:
                    swap(left, mid, arr);
                    left++;
                    mid++;
                    break;
                case 6:
                    mid++;
                    break;
                case 7:
                    swap(mid,right,arr);
                    right--;
                    break;
            }

        }
       return arr;
    }

    public static void main(String[] args) {
        int[] arr={5,6,5,6,7,7,5,5,6};
        System.out.println(Arrays.toString(sortOccurances(arr)));
    }
}
