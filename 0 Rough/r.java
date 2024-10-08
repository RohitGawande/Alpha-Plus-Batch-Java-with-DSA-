import java.util.Scanner;
public class r {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [][][] arr=new int[2][][];
		arr[0][0]=new int[2];	
		arr[0][1]=new int[1];
        arr[1][0]=new int[1];
        arr[1][1]=new int[1];
		//arr[3][2][0]=sc.nextInt();
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=sc.nextInt();			
					}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.print(arr[i][j][k]+" ");				}
			}
			System.out.println();
		}
		System.out.println();
	}
	}

