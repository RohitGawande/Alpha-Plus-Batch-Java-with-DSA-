import java.util.*;
public class Print_Hollowrect {
    //Print HOLLOW RECTANGLE pattern
    public static void Print_Hollo(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
            System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
    
        }

    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        n=sc.nextInt();
        System.out.print("Enter no. of col:");
        m=sc.nextInt();
        Print_Hollo(4, 5);
    }
}
