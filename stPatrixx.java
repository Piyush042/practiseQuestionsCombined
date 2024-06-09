import java.util.Arrays;

public class stPatrixx {
    static int findCount(int[] board , int[] jersey){
        int[] jerseyCopy = new int[jersey.length];
        int[] initial = new int[jersey.length];
        System.arraycopy(jersey, 0, initial, 0, jersey.length); // copying to initial all jersey elements.
        int count = 0;
        do{
            for (int j=0;j<jersey.length;j++) {
                jerseyCopy[j] = jersey[j];

            }
            for (int j=0;j<jersey.length;j++) {
               jersey[board[j]-1] = jerseyCopy[j];

            }
            count ++;
        }
        while (!Arrays.equals(jersey, initial) );
        return count ;
    }

    public static void main(String[] args) {

        int[] board = {1,2,3};
        int[] jersey = {1,2,3};
        System.out.println(findCount(board,jersey));
    }
}
