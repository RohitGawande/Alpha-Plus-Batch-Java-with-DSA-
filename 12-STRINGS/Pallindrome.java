 //WAP to check if a string is Pallindrome or not
public class Pallindrome {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(isPalindrome(str));
        String st1="rohit";
        System.out.println(isPalindrome(st1));
    }
}
