import java.util.*;
public class Inverted_Star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //nested loops
        for(int i=0;i<n;i++){
            for(int j=n-i+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    
}
