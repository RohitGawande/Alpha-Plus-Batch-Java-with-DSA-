import java.util.ArrayList;

public class kkk {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        int element=list.get(2);
        System.out.println(element);
        list.remove(4);
        System.out.println(list);
        list.set(1,8);
        System.out.println(list);
        System.out.println(list.contains(5));
        list.add(3,15);
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
    }
}
