import java.util.Scanner;

public class Basic {
    public static void print(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
   public static void main(String[] args) {
    String str="xyz";
    String str1=new String("xyz");
    //Strings are IMMUTABLE
    //Input
    Scanner sc=new Scanner(System.in);
    String strr=sc.next();
    //output
    System.out.print(strr);
    String str5=sc.nextLine();
    // System.out.println(str5);
     String fulname="Rohit Gawande";
     System.out.println(fulname.length());
     //Concatination
     String Firstname="Rohit";
     String Lastname="Gawande";
     String FullName=Firstname +" "+ Lastname;
     System.out.println(FullName);
     System.out.println(FullName.charAt(6));
     print(FullName);

  } 
}
