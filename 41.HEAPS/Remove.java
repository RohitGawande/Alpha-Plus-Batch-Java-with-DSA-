import java.util.ArrayList;

public class Remove {
       static class Heap {
        ArrayList<Integer> p=new ArrayList<>();
    public void insert(int data){
        //Add at Last 
        p.add(data);
        int child=p.size()-1;
        int parent=(child-1)/2;

        //Swap
        while (p.get(child)<p.get(parent)) {
            int temp=p.get(child);
            p.set(child, p.get(parent));
            p.set(parent, temp);
            child=parent;
            parent=(child-1)/2;
        }
    }
        public int peek(){
            return p.get(0);
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<p.size() && p.get(minidx)>p.get(left)){
                minidx=left;
            }
            if(right<p.size() && p.get(minidx)>p.get(right)){
                minidx=right;
            }
            if (minidx!=i) {
                // Swap
                int temp=p.get(i);
                p.set(i, p.get(minidx));
                p.set(minidx, temp);
                heapify(minidx);
            }
        }
        public int remove(){
            int data=p.get(0);
            //Step 1: Swap First and Last
            int temp=p.get(0);
            p.set(0,p.get( p.size()-1));
            p.set(p.size()-1, temp);

            //Step 2:remove
            p.remove(p.size()-1);

            //Step3: Heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return p.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.insert(3);
        h.insert(4);
        h.insert(1);
        h.insert(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
     }
}
