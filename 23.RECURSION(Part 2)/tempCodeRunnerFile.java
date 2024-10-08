public class Q12 {
    /*In the problem "Remove Duplicates in a String,
    " we are tasked with removing duplicate characters from a string that contains only
     lowercase English letters (from 'a' to 'z'). */
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if (idx==str.length()) {
            System.out.println(newStr);
            return;
        }
        int curChar=str.charAt(idx);
        if (map[curChar-'a']==true) {
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[curChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(curChar), map);
        }
    }
     public static void main(String[] args) {
        String str="rohitttgaawande";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
