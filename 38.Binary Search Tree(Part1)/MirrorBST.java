public class MirrorBST {
    static class  Node {
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
        
    }
    public static Node  createMirror(Node root){
        if (root==null) {
            return null;
        }
        Node leftMirror=createMirror(root.left);
        Node rightMirror=createMirror(root.right);

        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void preorder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
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

        /*        1
         *       / \
         *      3   2
         *     / \ / \
         *    7  6 5  4
         */
        root=createMirror(root);
        preorder(root);
    }
}
