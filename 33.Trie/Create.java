public class Create {
    static class  Node  {
        Node children[]=new Node[26];
        boolean endOfWord=false;
        
    }
    Node(){
        for (int i = 0; i < 26; i++) {
            children[i]=null;
        }
    }
    public static Node root=new Node();
    public static void main(String[] args) {
        
    }
}
