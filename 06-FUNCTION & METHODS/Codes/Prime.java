import java.util.Scanner;

public class Prime {
    public static void  Prime(int n) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                System.out.println("Not Prime");
            }else{
                System.out.println("Prime");
            }
            
        }
    }
    public static void main(String[] args) {
        Prime(n);
    }
}
