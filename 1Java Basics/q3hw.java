import java.util.Scanner;

public class q3hw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float Pen=sc.nextFloat();
        float Pencil=sc.nextFloat();
        float Eraser=sc.nextFloat();
        float ToCost=Pen+Pencil+Eraser;
        float GST=ToCost*(0.18f);
        float ToCost_GST=ToCost+GST;
        System.out.println(ToCost_GST);
        


    }
}
