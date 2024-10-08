import java.util.Scanner;

public class Sum {
    //Parameter or formal parameter
    public static int Sum(int a,int b) {
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter a:");
        int b=sc.nextInt();
        //argumets or actual parameter
        System.out.println("Sum of a,b is:"+Sum(a, b));
    }
}
