package Assignment;

import java.util.Scanner;

//WAP to get a no. from the user and print whether
// it is positive or negative
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. :");
        int n=sc.nextInt();
        if(n>0)
        System.out.println("Entered no. is Positive");
        else if(n==0)
        System.out.println("Entered no. is Zero");
        else
        System.out.println("Entered no. is Negative");
    }
}
