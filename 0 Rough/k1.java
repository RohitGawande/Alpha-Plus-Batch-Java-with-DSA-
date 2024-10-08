import java.util.ArrayList;

public class k1 {
    public static void main(String[] args) {
        // int a[]=new int[3];
        // a[0]=4;
        // a[1]=5;
        // a[2]=6;
        // a[3]=7;//Array are guarded with boundries
        ArrayList al=new ArrayList();
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.add(1,6);
        System.out.println(al);
    }
}
