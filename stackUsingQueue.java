import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int data){
       while(!q1.isEmpty()){
           q2.offer(q1.poll());
       }
       q1.offer(data);
       while(!q2.isEmpty()){
           q1.offer(q2.poll());
       }
    }



}
