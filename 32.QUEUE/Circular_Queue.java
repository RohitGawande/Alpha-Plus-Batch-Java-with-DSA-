import java.util.Queue;

public class Circular_Queue {
    static class Queue1 {
    static int ar[];
    static int size;
    static int rear;
    static int front;
    Queue1(int n){
        ar=new int[5];
        size=n;
        rear=-1;
        front=-1;
    }
    public static boolean isEmpty(){
        return rear==-1&& front==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }  
      //add
    public static void add(int data){
        if(isFull()){
           System.out.println("Queue is Full");
           return;
    }
    if(front==-1){
        front=0;
    }
    rear=(rear+1)%size;
    ar[rear]=data;
}
    public static int remove(){
        if(isEmpty()){
            System.out.println("Statck is Empty");
            return -1;
        }

        int result=ar[front];
      
        if(rear==front){
            rear=front=-1;
        }else{
            front=(front+1)%size;
        }
        
        return result;
    }
     //Peek
     public static int peek(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        return ar[front];
    }
}
    public static void main(String[] args) {
        Queue1 q=new Queue1(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
