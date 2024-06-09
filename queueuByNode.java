public class queueuByNode {
    queueuByNode next;
    int data;
    queueuByNode front;
    queueuByNode rear;
    queueuByNode(int data){
        this.data = data;
        front = rear = null;

    }
    void enqueue(int data){
        queueuByNode newNode = new queueuByNode(data);
        if(front==null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    int dequeue(){
        if(front == null)throw new RuntimeException("underflow error");
        int result = front.data;
        front = front.next;
        return result;
    }
}
