public class Preorder {

    // Step 1: Node class for the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Step 2: BinaryTree class with tree-building logic
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;

            // Base case: -1 means null node
            if (nodes[idx] == -1) {
                return null;
            }

            // Recursive case: create new node and build its subtrees
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Step 3: Preorder traversal function
    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " "); // 1. Visit root
        preorder(root.left);               // 2. Traverse left
        preorder(root.right);              // 3. Traverse right
    }

    // Step 4: Main function to test
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.print("Preorder Traversal: ");
        preorder(root);  // Output: 1 2 4 5 3 6
    }
}
