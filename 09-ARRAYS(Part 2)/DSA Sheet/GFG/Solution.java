public class Solution {
    public static boolean isSortedRotated(int ar[],int target){
        int n=ar.length-1;
        int pivot=-1;
        for (int i = 0; i < n; i++) {
            if (ar[i]>ar[i+1]) {
                pivot=i;
                break;
            }
        }
        int low=(pivot+1)%n;
        int high=pivot;
        while (low!=high) {
            int sum=ar[low]+ar[high];
            if (sum==target) {
                return true;
            }else if (sum<target) {
                low=(low+1)%2;
            }else{
                high=(high-1+n)%2;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {11, 15, 6, 8, 9, 10};
        int target1 = 16;
        System.out.println(isSortedRotated(arr1, target1));
    }
}
