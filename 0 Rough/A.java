public class A {
    static class Queue {
        static int []ar;
        static int size;
        static int rear;
        Queue(int n){
            ar=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void enque(int data)
        {
            if (rear==size-1) {
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            ar[rear]=data;

        }
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front=ar[0];
            for (int i = 0; i < rear; i++) {
                ar[i]=ar[i+1];
            }
            rear--;
            return front;
        }
        
    }
}
