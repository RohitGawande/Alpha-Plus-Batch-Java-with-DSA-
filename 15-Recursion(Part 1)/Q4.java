import java.util.*;
public class Q4 {
    //Print sum of first n natural no.
    public static int PrintSum(int n) {
        if(n==1){
            return 1;
        }
        int sum=n+PrintSum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        System.out.println(PrintSum(n)); 
    }
}
