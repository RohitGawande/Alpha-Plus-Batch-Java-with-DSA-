import java.util.ArrayList;

public class Basic1 {
    public static void main(String[] args) {
        //Length or Size
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
              }
    }
}
