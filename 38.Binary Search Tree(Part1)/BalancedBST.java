import java.util.ArrayList;

public class BalancedBST {
    //Convert BST to Balanced BST
    static class Node {
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        public static void inOrder(Node root){
            if (root==null) {
                return ;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        
    }
    public static void getInorder(Node root,ArrayList<Integer>inorder){
        if (root==null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node balancedBST(Node root){
        //inorder Sequence
        ArrayList<Integer>inorder=new ArrayList<>();
        getInorder(root, inorder);

        //Sorted 
    }
    public static void main(String[] args) {
    /*               8

     *            /     \
     *           6       10
     * 
     *         /            \
     *        5              11
     *       /                 \
     *      3                   12
     * 
     */
        Node root=new Node(8);

        //Left Subtree
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        //Right Subtree
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
    /*            8
         *      /   \
         *     5     11
         *    / \    / \
         *   3   6  10  12
         */
       

            
    }
}
