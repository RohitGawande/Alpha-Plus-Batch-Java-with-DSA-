public class AreEqual {
    public static void main(String[] args) {
        String s1="Rohit";
        String s2="Rohit"; 
        String  s3=new String("Rohit");
        // if(s1==s2){
        //     System.out.println("Strings are Equal");
        // }
        // else{
        //     System.out.println("Strings are not Equal");
        //    }
        //    if(s1==s3){
        //     System.out.println("Strings are Equal");
        // }
        // else{
        //     System.out.println("Strings are not Equal");
        //    }
        if(s1.equals(s3)){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");

        }
    }
}
