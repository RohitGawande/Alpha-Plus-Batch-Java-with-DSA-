import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of Pen:");
        float pen=sc.nextFloat();
        System.out.println("Enter the price of Pencil:");
        float pencil=sc.nextFloat();
        System.out.println("Enter the price of Eraser:");
        float Eraser=sc.nextFloat();
        float Total=(pen+pencil+Eraser);
        System.out.println("Bill:"+Total);
        float Total_GST=Total+(0.18f*Total);
        System.out.println("Bill with GST:"+Total_GST);
        
        
    }
}
