public class InsertionSort {

    // Pick an element (from unsorted part) & place it in the right pos in sorted part
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];      // current element to be inserted
            int prev = i - 1;

            //  Find the correct position to insert 'curr' in sorted part [0...i-1]
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];  // shift element to the right
                prev--;
            }

            //  Place curr in the correct sorted position
            arr[prev + 1] = curr;

            //  Print step-by-step array status after each insertion
            System.out.print("After inserting element at index " + i + ": ");
            printArr(arr);
        }
    }

    public static void printArr(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        System.out.println("Initial Array: ");
        printArr(arr);

        insertionSort(arr);

        System.out.println("Final Sorted Array: ");
        printArr(arr);
    }
}
