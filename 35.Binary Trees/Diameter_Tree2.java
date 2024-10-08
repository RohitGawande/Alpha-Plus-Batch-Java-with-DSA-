public class Diameter_Tree2 {
    static class Node {
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;

        }
        int  leftD=diameter(root.left);
        int  leftH=height(root.left);
        int rightD=diameter(root.right);
        int rightH=height(root.right);
        int selfD=leftH+rightH+1;
        return Math.max(selfD,Math.max(rightD, leftD));
    }
    public static int diameter2(Node root){
        if(root==null){
            return 0;

        }
        int  leftD=diameter2(root.left);
        int  leftH=height(root.left);
        int rightD=diameter2(root.right);
        int rightH=height(root.right);
        int selfD=leftH+rightH+1;
        return Math.max(selfD,Math.max(rightD, leftD));
    }
    static class Info {
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter1(Node root ){
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter1(root.left);
        Info rightInfo = diameter1(root.right);

        int myHeight = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        int diam1 = leftInfo.diam;
        int diam2 = rightInfo.diam;
        int diam3 = leftInfo.ht + rightInfo.ht + 1;

        int myDiameter = Math.max(diam3, Math.max(diam1, diam2));
        return new Info(myDiameter, myHeight);
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
        System.out.println(diameter1(root).ht);
        System.out.println(diameter1(root).diam);
    }
}
