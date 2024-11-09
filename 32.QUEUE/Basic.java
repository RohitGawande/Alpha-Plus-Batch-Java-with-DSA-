public class Basic {
    // Static class for Queue
    static class Queue {
        static int[] ar;     // Array for queue elements
        static int size;     // Maximum size of the queue
        static int rear;     // Index for the rear element
        
        // Constructor for initializing the queue
        Queue(int n) {
            ar = new int[n];
            size = n;
            rear = -1;
        }

        // Check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1;
        }

        // Add (enqueue) an element to the queue
        public static void add(int data) {
            if (rear == size - 1) { // Check if the queue is full
                System.out.println("Queue is Full");
                return;
            }
            rear++;           // Increment rear to next index
            ar[rear] = data;  // Insert data at the rear
        }

        // Remove (dequeue) an element from the queue
        public static int remove() {
            if (isEmpty()) {   // Check if the queue is empty
                System.out.println("Empty Queue");
                return -1;
            }
            int front = ar[0]; // Store the front element to return later
            // Shift elements to the left by one position
            for (int i = 0; i < rear; i++) {
                ar[i] = ar[i + 1];
            }
            rear--;            // Decrement rear after shifting
            return front;      // Return the removed front element
        }

        // Retrieve (peek) the front element without removing it
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return ar[0];      // Return the front element
        }
    }

    // Main method to test the Queue implementation
    public static void main(String[] args) {
        Queue q = new Queue(5);
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while (!q.isEmpty()) {
            System.out.println("Front Element: " + q.peek()); // Display front element
            q.remove(); // Remove the front element
        }
    }
}