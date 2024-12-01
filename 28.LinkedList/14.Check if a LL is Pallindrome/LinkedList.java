public class LinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node midCal(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            slow=slow.next.next;
        }
        return slow;//slow is mid
    }
    public static void main(String[] args) {
        
    }
}
