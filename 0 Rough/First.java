public class First {
    int num; // Instance variable of the outer class
    A obj1 = new A(); // Creating an instance of the inner class

    public void show() {
        // Method of the outer class that displays the value of 'num'
        System.out.println("In show method: " + num);
    }

    class A { // Non-static inner class
        public void config() {
            // Method of the inner class
            System.out.println("In config method");
            show(); // Accessing the outer class method directly
        }
    }

    public static void main(String[] args) {
        First obj = new First(); // Creating an instance of the outer class
        obj.show(); // Calling the outer class method
        A innerObj = obj.new A(); // Creating an instance of the inner class
        innerObj.config(); // Calling the inner class method
    }
}

