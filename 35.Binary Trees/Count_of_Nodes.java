public class Count_of_Nodes {
    static class Node {
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
        
    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int lCount=countNodes(root.left);
        int rCount=countNodes(root.right);
        return lCount+rCount+1;
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
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(countNodes(root));
    }
}
