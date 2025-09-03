import java.util.Stack;

public class Example1 {
    public static String reverse(String s){
        Stack<Character> st=new Stack<>();
        for (Character character : s.toCharArray()) {
            st.push(character);
        }
        StringBuilder sb=new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
         // Input string
        String s = "abc";
        
        // Call the reverseString method to reverse the input string
        String result = reverse(s); 
        
        // Print the reversed string
        System.out.println("Reversed String: " + result);
    }
}
