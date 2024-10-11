public class Max_Subarray_Sum {
    //Prefix Sum
    public static void printSubArSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
       int Prefix[]=new int[arr.length];
       Prefix[0]=arr[0];
       for (int i = 1; i < Prefix.length; i++) {
        Prefix[i]=Prefix[i-1]+arr[i];
       }
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                currSum= start==0 ? Prefix[end]:Prefix[end]-Prefix[start-1];
                
              
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
