public class Search_BST {
    static class  Node {
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }
    public static boolean searchBST(Node root,int key){
        if(root==null){
            return false;
        }
        if (root.data==key) {
            return true;
        }
        if(key<root.data){
           return searchBST(root.left, key);
        }
        else{
            return searchBST(root.right, key);
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if (root.data>val) {
            //Left Subtree
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        if (searchBST(root, 7)) {
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
