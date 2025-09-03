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
    public void addMid(int idx,int data){
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
}
