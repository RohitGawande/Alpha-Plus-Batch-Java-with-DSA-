public class Max_Subarray_Sum {
    //Kadane's Algorithm 
    public static void printKadane(int arr[]){
        //Current Sum
        int cs=0;
        //Max Sum
        int ms=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs=cs+arr[i];
            if (cs<0) {
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        System.out.println("Max Sum:"+ms);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        printKadane(arr);
    }
}
