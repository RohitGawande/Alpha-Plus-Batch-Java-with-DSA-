public class Q5 {
    public static String subString(String str,int si,int ei){
        String subst="";
        for(int i=si;i<ei;i++){
            subst+=str.charAt(i);
        }
        return subst;
    }
    public static void main(String[] args) {
        String str="Hello Rohit";
        System.out.println(str.substring(0, 5));
        System.out.println(subString(str, 2, 5));
    }
}
