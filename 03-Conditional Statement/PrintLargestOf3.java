import java.util.Scanner;

public class PrintLargestOf3 {
     public static void main(String[] args) {
        //Elif Statement
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three no. :");
        System.out.print("Enter A :");
        int a=sc.nextInt();
        System.out.print("Enter B :");
        int b=sc.nextInt();
        System.out.print("Enter C :");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is largest");
        }else if (b>=c) {
            System.out.println("B is largest");

        }else{
         System.out.println("C is largest");

        }
     }
}
