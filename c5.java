public class c5 {
    static int countAll(int n,int[] arr){
        int max =arr[0];
        int count = 1;
        for(int i =1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr ={7,4,8,2,9};
        int n =5;
        System.out.println(countAll(n,arr));;
    }
}
