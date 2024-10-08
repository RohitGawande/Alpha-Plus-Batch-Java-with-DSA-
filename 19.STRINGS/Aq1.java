package STRINGS;

public class Aq1 {
    public static boolean isStr(String str) {
        for(int i=0;i<str.length();i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                 return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(isStr(str));
    }
}
