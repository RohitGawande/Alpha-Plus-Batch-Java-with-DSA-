package Assignment;

import java.util.Scanner;

public class Q3 {
    /*WAP to input week number(1-7) and printday
    of week name using switch case */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Week num:");
        int n=sc.nextInt();
        switch (n) {
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wedday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
                break;        
            default:System.out.println("Invalid number.");
                break;
        }
    }
}
