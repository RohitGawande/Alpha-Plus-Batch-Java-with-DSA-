
public class LinedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void  addFirst(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
     public void  addLast(int data){
        Node newNode=new Node(data);
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
    public static void main(String[] args) {
        LinedList j1=new LinedList();
        j1.printll();
        j1.addFirst(1);
        j1.printll();
        j1.addFirst(2);
        j1.printll();
        j1.addLast(3);
        j1.printll();
        System.out.println("******");
        j1.addMid(2, 5);
        j1.printll();

    }
}
