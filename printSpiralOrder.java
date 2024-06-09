import java.util.ArrayList;
import java.util.Arrays;

public class printSpiralOrder {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> list = new ArrayList<>();
       int left = 0;
       int right = c-1;
       int top = 0 ;
       int bottom = r-1;
       while (top<=bottom && left<= right){
           for(int i =left;i<= right;i++){
               list.add(matrix[top][i]);
           }
           top++;
           for(int i =top;i<= bottom;i++ ){
               list.add(matrix[right][i]);
           }
           right--;
           if(top<= bottom){ //condition of single row
               for (int i = right;i >= left;i--){
                   list.add(matrix[bottom][i]);
               }
               bottom--;
           }
           if(left<= right){ //condition of single column
               for(int i = bottom;i>=top;i--){
                   list.add(matrix[left][i]);
               }
               left++;
           }
       }
         return list;
    }
}
