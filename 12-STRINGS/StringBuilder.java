public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        //To add char in sb
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length);
    }
}
