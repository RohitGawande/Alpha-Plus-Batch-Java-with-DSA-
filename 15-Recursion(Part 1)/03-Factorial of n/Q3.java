import java.util.Scanner;

public class Q3 {
    public static int CalFact(int n) {
        if(n==0){
            return 1;
        }
        int a=n*CalFact(n-1);
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is :"+CalFact(n));
    }
}
