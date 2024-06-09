import java.util.Arrays;

public class c1 {

    static int[] separateZerosOnesTwos(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int iterator = 0;

        while (iterator <= j) {
            switch (arr[iterator]) {
                case 0:
                    swap(arr, i, iterator);
                    i++;
                    iterator++;
                    break;
                case 1:
                    iterator++;
                    break;
                case 2:
                    swap(arr, iterator, j);
                    j--;
                    break;

            }
        }

        return arr;
    }
    static int[] zeroinlastbySwitch(int[] arr, int n){
        int iterator = 0 ;
        int index0keeper= n-1;
        while (iterator<index0keeper){
            if (arr[iterator] == 0) {
                swap(arr, iterator, index0keeper);
                index0keeper--;
            } else {
                iterator++;
            }

        }
        return arr;
    }
    static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] zerosInLast(int[] arr,int n){
        int i =0;
        int j = n-1;
        while(i<j){

            if(arr[i]==0){
                swap(arr,i,j);

                j--;
            }
            else{
                i++;
            }
        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = {0,0,1,0,0,1,0};
        int n = 8;
        System.out.println(Arrays.toString(separateZerosOnesTwos(arr)));
    }
}
