public class Iterative_Search {
    //Search for a key in a Linked List.Return the position
    //where it is found .if not found return -1.
    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=next;
        }
      }
      public static Node head;
      public int itrSearch(int key){
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
}
