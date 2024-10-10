import java.util.Scanner;

public class Q {
    public static void larget(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]>matrix[i+1][j+1]){
                matrix[i][j]=matrix[i+1][j+1];
            }else{
                System.out.println("Larget element found at Cell:"+matrix[i][j]);
            }
        }
    }
       System.out.println();
    }
    public static void smallest(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]>matrix[i+1][j+1]){
                matrix[i][j]=matrix[i+1][j+1];
            }else{
                System.out.println("Larget element found at Cell:"+matrix[i][j]);
            }
        }
    }
       System.out.println();
    }

    public static void main(String[] args) {
        //Creation of 2d Arrays
        
    int matrix[][]=new int[3][3];
    int n=matrix.length;
    int m=matrix[0].length;
    //For input
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
     //For output
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           System.out.print(matrix[i][j]+" "); 
        }
        System.out.println();
    }
    larget(matrix, m);
    smallest(matrix, m);
    }
}
