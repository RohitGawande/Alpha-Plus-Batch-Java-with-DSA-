import java.util.Stack; // Importing the Stack class from the Java library.

public class Example {
    // Function to reverse a string using a stack
    public static String reverseString(String str) {
        // Step 1: Create a stack to hold the characters of the string
        Stack<Character> s = new Stack<>();
        
        // Step 2: Push each character of the string onto the stack
        int idx = 0; // Index to iterate through the string
        while (idx < str.length()) {
            s.push(str.charAt(idx)); // Push the current character onto the stack
            idx++;
        }
        
        // Step 3: Create a StringBuilder to build the reversed string
        StringBuilder sb = new StringBuilder("");
        
        // Step 4: Pop characters from the stack and append them to the StringBuilder
        while (!s.isEmpty()) {
            char curr = s.pop(); // Pop the top character from the stack
            sb.append(curr);     // Append it to the reversed string
        }
        
        // Step 5: Return the reversed string
        return sb.toString();
    }

    public static void main(String[] args) {
        // Input string
        String str = "abc";
        
        // Call the reverseString method to reverse the input string
        String result = reverseString(str); // Corrected 'reult' to 'result'
        
        // Print the reversed string
        System.out.println("Reversed String: " + result);
    }
}
