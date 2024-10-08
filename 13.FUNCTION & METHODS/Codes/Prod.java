import java.util.Scanner;

public class Prod {
    public static int Pro(int a,int b){
        int mul=a*b;
        System.out.println(mul);
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Pro(a, b);
    }
}
