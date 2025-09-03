public class HW {
    public static int  binarySearch(int ar[], int key){
        int start=0;
        int end=ar.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (ar[mid]==key) {
                return mid;
            }else if(ar[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int ar[]={1,2,3,4,5,6};
       int key=6;
       int index=binarySearch(ar,key);
       System.out.println(index);
        
    }
}
