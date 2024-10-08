import java.util.Scanner;

public class BinaryProg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("The sum of a,b is:"+(a+b));
        System.out.println("The sub of a,b is:"+(a-b));
        System.out.println("The mul of a,b is:"+(a*b));
        System.out.println("The div of a,b is:"+(a/b));
        System.out.println("The rem of a,b is:"+(a%b));

    }
}
