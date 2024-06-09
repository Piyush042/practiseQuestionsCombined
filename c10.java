public class c10 {
    static int findTotal(int [] arr1, int[] arr2){
        int count =0;
        int maxCount = Integer.MIN_VALUE;
        for(int i=0;i< arr1.length;i++){
            count+= arr1[i]-arr2[i];
            if(count>maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr1 = {7,0,5,1,3};
        int[] arr2 = {1,2,1,3,4};
        System.out.println(findTotal(arr1,arr2));
    }

}
