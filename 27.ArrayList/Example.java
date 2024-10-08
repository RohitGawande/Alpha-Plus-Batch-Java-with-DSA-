import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(i*1);//1 2 3 4 5
            list2.add(i*2);//2 4 6 8 10
            list3.add(i*3);//3 6 9 12 15
        }
     mainList.add(list1);
     mainList.add(list2);
     mainList.add(list3);
     list1.remove(3);
     System.out.print(mainList);
     System.out.println( );

        //Nested Loops
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
