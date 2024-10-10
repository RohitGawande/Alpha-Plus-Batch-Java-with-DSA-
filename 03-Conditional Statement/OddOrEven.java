import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        //if-else Statement
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int  n=sc.nextInt();
        if(n%2==0){
            System.out.println("Num is even");
        }else{
            System.out.println("Num is odd");
        }
    }
}
