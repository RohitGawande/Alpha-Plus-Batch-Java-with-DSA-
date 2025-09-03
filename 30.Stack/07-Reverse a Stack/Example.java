import java.util.Stack;

public class Example {

    // Method to push an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base case: If stack is empty, push the data
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Step 1: Pop the top element and store it
        int top = s.pop();

        // Step 2: Recursive call to push 'data' at the bottom
        pushAtBottom(s, data);

        // Step 3: Push back the stored top element
        s.push(top);
    }

    // Method to reverse the stack using recursion
    public static void reverseStack(Stack<Integer> s) {
        // Base case: If stack is empty, do nothing
        if (s.isEmpty()) {
            return;
        }

        // Step 1: Pop the top element
        int top = s.pop();

        // Step 2: Recursively reverse the remaining stack
        reverseStack(s);

        // Step 3: Push the popped element at the bottom of the reversed stack
        pushAtBottom(s, top);
    }

    // Method to print the stack elements from top to bottom
    public static void printStack(Stack<Integer> s) {
        // Keep popping elements until the stack is empty
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // Print original stack
        System.out.println("Original Stack:");
        printStack(s);

        // Refill the stack to demonstrate reversing
        s.push(1);
        s.push(2);
        s.push(3);

        // Reverse the stack
        reverseStack(s);

        // Print reversed stack
        System.out.println("Reversed Stack:");
        printStack(s);
    }
}
