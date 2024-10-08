import java.util.Scanner;

public class q2hw {
    public static void main(String[] args) {
        //input 3 no. A,B,C ,you have to output the average of this 3 no.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("The avg of 3 no. is:"+avg);

    }
}
