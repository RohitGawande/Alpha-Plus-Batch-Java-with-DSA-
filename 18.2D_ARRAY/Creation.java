import java.util.Scanner;

public class Creation {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                    if(matrix[i][j]==key){
                        System.out.println("Elem found at Cell:("+i+","+j+")");
                        return true;
                    }
            }
        }
        System.out.println("Key not found");
        return false;
        }
    
    public static void main(String[] args) {
        //Creation of 2d Arrays
        
    int matrix[][]=new int[3][3];
    int m=matrix.length;
    int n=matrix[0].length;
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
    search(matrix, 6);
    }
    
    
}
