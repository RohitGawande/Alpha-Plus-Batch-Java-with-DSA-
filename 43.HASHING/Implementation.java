import java.util.*;
import java.util.LinkedList;
public class Implementation {
    static class HashMap<K,V> { //Generic
        private class Node {
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
            
        }
        private int n;// n
        private int N;
        private LinkedList<Node> buckets[]; //N=buckets.length
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunc(K key){
            int hc=key.hashCode();
           return Math.abs(hc)% N;
        }
        private int SearchInLL(K key ,int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for (int i = 0; i < ll.size(); i++) {
                Node node=ll.get(i);
                if (node.key.equals(key)) {
                  return di;  
                }
                di++;
            }
                return -1;
        }
        private void reHash(){
            LinkedList<Node>oldbuck[]=buckets;
            buckets=new LinkedList[2*N];
            N=2*N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i]=new LinkedList<>();
            }
            //Nodess -->add in bucket
            for (int i = 0; i < oldbuck.length; i++) {
                LinkedList<Node>ll=oldbuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value){
            int bi=hashFunc(key);
            int di=SearchInLL(key, bi);
            if (di!=-1) {
                Node node=buckets[bi].get(di);
                node.value=value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda=(double)n/N;
            if (lambda>2.0) {
                reHash();
            }
        }
       
        public boolean containsKey(K key){
            return false;
        }
        public V remove(K key){
            return null;
        }
        public V get(K key){
            return null;
        } 
    }
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("America", 55);
        hm.put("Aus", 50);
        hm.put("SA", 60);
    }
}
