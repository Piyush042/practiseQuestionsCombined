import java.util.ArrayList;
import java.util.Arrays;



public class intersection extends Bubblesort {
    static void quickSort(int[] arr){
        int n = arr.length-1;
        quickSortutil(arr, 0,n);

    }

    private static void quickSortutil(int[] arr, int start, int end) {
        if(start >= end){
            return;
        }
        int pivot= start;
        int left = start+1;
        int right = end;
        while(left<right){
            if(arr[left]>arr[pivot] && arr[right]<arr[pivot]){
                swap(arr,left,right);
            }
            if(arr[left] <= arr[pivot]) {
                left += 1;
            }
            if(arr[right] >= arr[pivot]) {
                right -= 1;
            }
        }
        swap(arr,pivot,right);
        quickSortutil(arr,start,right-1);
        quickSortutil(arr,right+1,end);

    }


    static int[] intersectedArray(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j =0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j])j++;
            else i++;
        }
        int[] convArray = new int[arr.size()];
        int index =0;
        for(int k :arr){
            convArray [index++] = k;
        }
        return convArray;
    }
}
