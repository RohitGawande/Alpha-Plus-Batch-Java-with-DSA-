import java.util.*;
import java.util.LinkedList;
public class Top_View {
   static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info {
        Node node;
        int hd;
        public Info(Node node,int hd){

        }
        
    }
    public static void topView(Node root){
        //Level Order
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();
        int min=0,max=0;

    }
    public static void main(String[] args) {
        /*        1
         *       / \
         *      2   3
         *     / \ / \
         *    4  5 6  7
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
    }
}
