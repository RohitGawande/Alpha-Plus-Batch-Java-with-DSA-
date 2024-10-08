import java.util.ArrayList;
public class Reverse {
    public static void main(String[] args) {
        //WAP to reverse an arraylist
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
