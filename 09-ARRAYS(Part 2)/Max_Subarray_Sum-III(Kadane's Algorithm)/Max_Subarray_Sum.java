public class Max_Subarray_Sum {
    public static void printSubArSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                currSum=0;//it will change 
                for (int k = start; k <= end; k++) {
                   currSum+=arr[k];
                }
                System.out.println("Current Sum:"+currSum+" ");
                if (maxSum<currSum) {
                    maxSum=currSum;
                }
            }
           
        }
        System.out.println("Max Sum:"+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        printSubArSum(arr);
    }
}
