import java.util.Scanner;

public class kk {
    public static void PrintStr(String FullName){
        for(int i=0;i<FullName.length();i++){
            System.out.print(FullName.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str="Rohit Gawande";
        String str1=new String("Rohit");
        Scanner sc=new Scanner(System.in);
        String str2=sc.nextLine();
        System.out.println(str2);
        System.out.println(str.length());
        String FirstName="Rohit";
        String LastName="Gawande";
        String FullName=FirstName+" "+LastName;
        System.out.println(FullName);
        System.out.println(FullName.charAt(4));
        PrintStr(FullName);
    }
}
