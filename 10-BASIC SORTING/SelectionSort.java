public class SelectionSort {
    
    // Method to perform Selection Sort
    public static void SelectionSort(int arr[]) {
        // Outer loop: Traverse the array (excluding the last element)
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;  // Assume the first element of unsorted part is minimum
            
            // Inner loop: Find the smallest element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {  // Compare current minimum with next element
                    minPos = j;  // Update position of minimum element
                }
            }
            
            // Swap the found minimum element with the first unsorted element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    
    // Method to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the program
    public static void main(String[] args) {
        int arr[] = {3, 2, 7, 5, 0};  // Input array
        System.out.println("Original Array:");
        printArr(arr);

        SelectionSort(arr);  // Sort the array

        System.out.println("Sorted Array:");
        printArr(arr);  // Print the sorted array
    }
}
