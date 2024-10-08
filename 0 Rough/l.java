import java.util.Scanner;

public class l {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of matrix:");
        int size=sc.nextInt();
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int arr[][][]=new int[size][size1][size2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                System.out.println("Enter the marks of college " +i+"class "+j +"student "+k);
                arr[i][j][k]=sc.nextInt();
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                System.out.print(arr[i][j][k]+" ");
            }
        }
            System.out.println();
        }
    }
}
