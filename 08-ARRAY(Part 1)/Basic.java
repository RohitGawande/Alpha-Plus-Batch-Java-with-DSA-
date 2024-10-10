import java.util.Scanner;
/*List of elements of the same type placed in a contigious memory location */
public class Basic {
    /* Create
     * Input
     * Output
     * Update
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Creation
        int arr[]=new int[5];
        // arr[0]=sc.nextInt();  //phy.
        // arr[1]=sc.nextInt();  //chem
        // arr[2]=sc.nextInt();//maths
        // System.out.println("Physics:"+arr[0]);
        // System.out.println("Chemistry:"+arr[1]);
        // System.out.println("Maths:"+arr[2]);
        //Update
        // arr[0]=67;
        // System.out.println("Physics:"+arr[0]);
        //int marks[]={4,5,7,8};
        // String names={"Rohit","Ronit","Virat"};
        //input
        // //int per=(arr[0]+arr[1]+arr[2])/3;
        // System.out.println(per);
        System.out.println(arr.length);
        int marks[]=new int[5];
        for(int i=0;i<marks.length;i++){
             marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
             System.out.println(marks[i]);  
        }



    }
}
