import java.util.*;
public class Q5 {
    // Calculate Fibonacci
    public static int CalFib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int Fnm1=CalFib(n-1);
        int Fnm2=CalFib(n-2);
        int Fn=Fnm1+Fnm2;
        return Fn;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        System.out.println(CalFib(n));
    }
}
