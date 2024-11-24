import java.util.Stack;

public class Example {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>(); // Main stack holding elements
        static Stack<Integer> s2 = new Stack<>(); // Auxiliary stack for reversing order

        // Check if the queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty(); // Queue is empty if s1 is empty
        }

        // Add an element to the queue
        public static void add(int data) {
            // Step 1: Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Step 2: Add the new element to s1
            s1.push(data);

            // Step 3: Move all elements back from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove and return the front element
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop(); // Directly pop from s1
        }

        // Peek the front element without removing it
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek(); // Return the top of s1
        }
    }

    // Main method to test the Queue implementation
    public static void main(String[] args) {
        Queue q = new Queue();

        // Adding elements to the queue
        q.add(1); // Add 1
        q.add(2); // Add 2
        q.add(3); // Add 3

        // Process and display all elements in the queue
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Display the front element
            q.remove(); // Remove the front element
        }
    }
}