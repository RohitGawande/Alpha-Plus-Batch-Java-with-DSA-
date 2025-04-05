public class LinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    //Head and Tail in LinkedList
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //step1 :create new Node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        //step2:NewNode next=head
        newNode.next=head;
        //step3:head=newNode
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        if(temp==null){
            System.out.println("LL is empty");
            return;
        }
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addMid(int idx,int data){
        if(idx==0){
            
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        temp.next=newNode.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
           System.out.println("LL is Empty"); 
           return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int itrSearch(int key){
    /*Search for a key in a Linked List.Return the position
    where it is found .if not found return -1.*/
        Node temp=head;
        int i=0;
        while ((temp!=null)) {
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        //Key not found
        return -1;

      }
      /*Search for a key in a linked list.Return the position where it is found.
       * if not found return -1.use recursion
       */
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        // ll.addMid(2, 5);
        // ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println("Key at index:"+ll.itrSearch(4));
        System.out.println("Key at index:"+ll.itrSearch(10));
    }
}
