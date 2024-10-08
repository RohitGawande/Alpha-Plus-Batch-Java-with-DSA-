import java.util.Scanner;

public class k3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int [][][]ar=new int[3][][];
         ar[0]=new int[2][];
         ar[1]=new int [3][];
         ar[2]=new int [1][];
         ar[0][0]=new int[2];
         ar[0][1]=new int[2];
         ar[1][0]=new int[2];
         ar[1][1]=new int[3];
         ar[1][2]=new int[1];
         ar[2][0]=new int[2];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                for(int k=0;k<ar[i][j].length;k++){
                     ar[i][j][k]=sc.nextInt();
                }
            }
        }
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                for(int k=0;k<ar[i][j].length;k++){
                    System.out.print(ar[i][j][k]);
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
