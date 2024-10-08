import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter Operator:");
        char opr=sc.next().charAt(0);
        switch (opr) {
            case '+': System.out.println("Sum of a and b is:"+(a+b));
                break;
            case '-': System.out.println("Sub of a and b is:"+(a-b));
                break;
            case '*': System.out.println("Mul of a and b is:"+(a*b));
                break;
            case '/': System.out.println("Div of b by a is:"+(a/b));
                break;   

            default:
                break;
        }
    }
}
