import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Print sum of first n natural num
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
