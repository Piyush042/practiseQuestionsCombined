public class queueMy {
    int[] arr;

    int rear;
    int capacity;
    queueMy(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        rear =-1;
    }

    void Offer(int data){
         if(rear == capacity-1){
             throw new RuntimeException("overflow error");
         }
         rear++;
         arr[rear] = data;
    }
    int peek(){
        if(rear ==-1)throw new RuntimeException("Underflow error");
        return arr[0];
    }
    int poll(){
        if(rear == -1)throw new RuntimeException("underflow error");
        int result = arr[0];
        for( int i =0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return result;
    }
}
