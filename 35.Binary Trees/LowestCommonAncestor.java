import java.util.ArrayList;

import org.w3c.dom.Node;

public class LowestCommonAncestor {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean getPath(Node root,int n,ArrayList<Node>path){
            path.add(root);
            if(root.data==n){
                return true;
            }
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        //Last Common Ancester
        int i=0;
        for(; i<path1.size()&& i< path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node lca=
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
        int n1=4,n2=5;
    }
    }
