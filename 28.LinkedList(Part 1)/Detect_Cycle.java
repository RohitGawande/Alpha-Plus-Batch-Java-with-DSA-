public class Detect_Cycle {
   static class Node1{
        int data1;
        Node1 nxt;
        public Node1(int data){
            this.data1=data1;
            this.nxt=null;
        }
    }
    public static Node1 head;
    
    public static boolean isCycle(){
        Node1 fast=head;
        Node1 slow =head;
        while ((fast!=null && fast.nxt!=null)) {
            slow=slow.nxt;
            fast=fast.nxt.nxt;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    //Detecting a cycle in a linkedList
    public static void main(String[] args) {
        head=new Node1(1);
        head.nxt=new Node1(2);
        head.nxt.nxt=new Node1(3);
        head.nxt.nxt.nxt=head;
        //1->2->3->1
        System.out.println(isCycle());


    }
}
