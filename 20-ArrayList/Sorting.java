import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        System.out.println(list);
        //ascending
        Collections.sort(list);
        System.out.println(list);
        //Descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
