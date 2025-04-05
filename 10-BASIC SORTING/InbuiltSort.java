import java.util.Arrays;

public class InbuiltSort {
    public static void printA(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,5,6,1};
        // Arrays.sort(arr);
        Arrays.sort(arr,0,4);
        printA(arr);
    }
}
