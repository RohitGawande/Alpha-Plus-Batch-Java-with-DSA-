import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        //Java Collection Framework
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Boolean>list1=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        /* Add Element O(1)
         * Get Element O(1)
         * Remove Element O(n)
         * Set element at index O(n)
         * Contains Element O(n)
         */
        //Add Element
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println();
        list.add(4,7);// O(n)
        System.out.println(list);
        System.out.println();
        //Get Element
       int element= list.get(2);
       System.out.println(element);
       System.out.println();
       //Remove Element
       list.remove(3);
       System.out.println(list);
       System.out.println();
       //Set index
       list.set(3, 3);
       System.out.println(list);
       //Contains Element
       System.out.println(list.contains(5));
       System.out.println(list.contains(6));
       System.out.println(list.contains(4));
       list.add(2,3);
       System.out.println(list);

    }
}
