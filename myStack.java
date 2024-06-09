public class myStack {
    int[] arr;
    int capacity ;
    int top;
    myStack(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    void push(int data){
        if (top==capacity-1)throw new RuntimeException("overflow");
        top++;
        arr[top] = data;
    }
    int pop(int data){
        if(top == -1)throw new RuntimeException("underflow");
        int result = arr[top];
        top--;
        return result;
    }



}
