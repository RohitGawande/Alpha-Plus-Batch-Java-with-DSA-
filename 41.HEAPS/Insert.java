import java.util.ArrayList;

public class Insert {
    static class Heap {
        ArrayList<Integer> p=new ArrayList<>();
    public void inser(int data){
        //Add at Last 
        p.add(data);
        int child=p.size()-1;
        int parent=(child-1)/2;

        //Swap
        while (p.get(child)<p.get(parent)) {
            int temp=p.get(parent);
            p.set(child, p.get(parent));
            p.set(parent, temp);
        }
    }
        public int peek(){
            return p.get(0);
        }
    }

    public static void main(String[] args) {
       Heap heap=new Heap();
       heap.inser(2);
    }
}
