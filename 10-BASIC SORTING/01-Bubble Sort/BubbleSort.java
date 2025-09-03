// Large elements come to the end of the array by swapping with adjacent elements
public class BubbleSort {
    // Function to perform Bubble Sort
    public static void BubbleSort(int arr[]) {
        // Outer loop to control the number of passes (turns)
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // Inner loop to compare adjacent elements and swap if needed
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to print the array after sorting
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function to test the Bubble Sort
    public static void main(String[] args) {
        // Example array to be sorted
        int arr[] = {5, 4, 1, 3, 2};

        // Calling Bubble Sort function
        BubbleSort(arr);

        // Printing the sorted array
        printArr(arr);
    }
}
