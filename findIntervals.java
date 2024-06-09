import java.util.Arrays;
import java.util.Comparator;

public class findIntervals {
    public int[][] overlappedInterval(int[][] Intervals)
    {
        int res  = 0;
        Comparator<int[]> com = new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                int firstDigit = a[0];
                int secondDigit = b[0];
                if (firstDigit != secondDigit) {
                    return Integer.compare(firstDigit, secondDigit);
                } else {
                    return Integer.compare(a[1], b[1]);
                }
            }
        };
        Arrays.sort(Intervals,com);
        int n = Intervals.length;
        for(int i=0;i<n;i++){
            if(Intervals[res][1]<Intervals[i][1]) {
                Intervals[res][0] = Math.min(Intervals[res][0], Intervals[i][0]);
                Intervals[res][1] = Math.max(Intervals[res][1], Intervals[i][1]);
            }
            else{
                res++;
                Intervals[res][0] = Intervals[i][0];
                Intervals[res][1] = Intervals[i][1];
            }
        }
        return Arrays.copyOfRange(Intervals,0,res+1);
    }

}
