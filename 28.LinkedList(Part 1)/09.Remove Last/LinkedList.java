public class LinkedList {
    class Node{
        int  data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
        public void  addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
     public void  addLast(int data){
        Node newNode=new Node(data);
        size++;

        if (head==null) {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void printll(){
        if (head==null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void addMid(int idx,int data){
      if (idx==0) {
        addFirst(data);
        return;
      }
        Node newNode=new Node(data);
         Node temp=head;
         int i=0;
    while (i<idx-1) {
    temp=temp.next;
    i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
    }
    public int removeFirst(){
        if (size==0) {
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }else if (size==1) {
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
    public int removeLast(){
        if (size==0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
    }
    public static void main(String[] args) {
    LinkedList ll=new LinkedList();
    ll.printll();
    ll.addFirst(1);
    ll.printll();
    ll.addFirst(2);
    ll.printll();
    ll.addFirst(3);
    ll.printll();
    ll.addLast(4);
    ll.printll();
    ll.addLast(5);
    ll.printll();
    ll.addLast(6);
    System.out.println("Size of a LinkedList:"+size);
    ll.removeFirst();
    ll.printll();
    System.out.println("Size of a LinkedList after removing First Element:"+size);
    }
}
