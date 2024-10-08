import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter income:");
        int income=sc.nextInt();
        float tax;
        if(income<500000){
             tax=0;
            System.out.println("Payable tax="+tax);
        }else if(income>500000 &&income<=1000000){
               tax=income*(0.2f);
            System.out.println("Payable tax:"+tax);
        }else{
            tax=income*(0.3f);
            System.out.println("Payable tax:"+tax);
        }
    }
}
