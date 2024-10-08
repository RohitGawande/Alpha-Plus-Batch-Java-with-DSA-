import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the three no. :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Avg=((a+b+c)/3);
        System.out.println("The Average of given three no. is :"+Avg);
    }
}
