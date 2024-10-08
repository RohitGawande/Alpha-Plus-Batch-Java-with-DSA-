import java.util.Scanner;

public class Bino {
    //Binomial Coefficient
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
             f=f*i;
        }
        return f;
    }
    public static int Binomial_Coefficient(int n,int r){
        int n_fact =factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial((n-r));
        System.out.println("Factorial of n:"+(n_fact));
        System.out.println("Factorial of r:"+(r_fact));
        System.out.println("Factorial of nmr:"+(nmr_fact));
       int Binomial=(n_fact)/(r_fact*nmr_fact);
       return Binomial;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int   n=sc.nextInt();
        System.out.println("Enter r:");
        int   r=sc.nextInt();
        
        System.out.println("Binomial Coefficient of n= "+n+" and r= "+r+" is: "+Binomial_Coefficient(n, r));
    }
}
