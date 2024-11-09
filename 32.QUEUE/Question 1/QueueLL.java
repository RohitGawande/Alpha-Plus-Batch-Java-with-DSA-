public class QueueLL {
    // Queue using Linked List   
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // Check if the queue is empty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add an element to the queue
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Remove and return the front element of the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // Peek the front element of the queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }

    // Main method to test the Queue implementation
    public static void main(String[] args) {
        Queue q = new Queue();

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
