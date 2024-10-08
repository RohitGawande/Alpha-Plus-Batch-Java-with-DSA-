public class Sorted_arBST {
    static class  Node {
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        public static void preorder(Node root){
            if (root==null) {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    public static Node createBST(int ar[],int si,int ei){
      if (si>ei) {
        return null;
      }
        int mid=(si+ei)/2;
        Node root= new Node(ar[mid]);
       root.left= createBST(ar, si, mid-1);
       root.right=createBST(ar, mid+1, ei);
       return root;
    }
    public static void main(String[] args) {
        int [] ar={3,5,6,8,10,11,12};
         /*       8
         *       / \
         *      5   11
         *     / \ / \
         *    3  6 10  12
         * Expected BST
         */
        Node root=createBST(ar, 0, ar.length-1);
        preorder(root);
    }
    }
}
