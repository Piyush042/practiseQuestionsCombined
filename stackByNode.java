public class stackByNode {
    stackByNode next;
    int data;
    stackByNode front;
    stackByNode(int data){
        this.data = data;
        front = null;
    }
    void push ( int data){
        stackByNode newNode = new stackByNode(data);
        if (front != null) {
            newNode.next = front;
        }
        front = newNode;
    }

    int pop(){
        if(front == null)throw new RuntimeException("underflow error");
        int result = front.data;
        front = front.next;
        return result;
    }

}
