public class Using_LL {
    static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    static class  Queue {
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        //Add 
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
    
        //Remove 
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty Queue" );
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
        }
         //Peek
     public static int peek(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        return head.data;
        
    }
}
public static void main(String[] args) {
    Queue q=new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    
    while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
    }
}
}
