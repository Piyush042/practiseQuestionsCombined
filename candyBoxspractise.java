import java.util.PriorityQueue;

public class candyBoxspractise {
    static int findMin (int [] arr, int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.offer(arr[i]);
        }
        int totalTime = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int time = first + second;
            totalTime += time;
            pq.offer(time);
        }
        return totalTime;
    }
}
