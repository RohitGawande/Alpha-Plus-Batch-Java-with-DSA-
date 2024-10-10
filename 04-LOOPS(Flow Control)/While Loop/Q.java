import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        //Print num from 1 to n
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
