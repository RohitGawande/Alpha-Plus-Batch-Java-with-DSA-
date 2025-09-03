public class BinarySearch {
    public static int binarySearch(int num1[],int key){
        int start=0;
        int end=num1.length-1;
       
        while (start<=end) {
             int mid=(start+end)/2;
             if (key==num1[mid]) {
                return mid;
             }else if (num1[mid]<key) {
               start=mid+1;
                
             }else{
                end=mid-1;
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num1[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("Key "+key+" Found at index: "+binarySearch(num1, key));
    }
}
