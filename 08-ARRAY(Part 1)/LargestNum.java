import java.util.*;
public class LargestNum {
    public static int largestNum(int num[]){
        int largest=Integer.MIN_VALUE;
        //For Smallest
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i]>largest) {
                largest=num[i];
            }
            if (smallest>num[i]) {
                smallest=num[i];
            }
            }
            System.out.println("Smallest Value is:"+smallest);
            return largest;
        }
         
    
    public static void main(String[] args) {
        int num[]={1,2,6,3,5};
        System.out.println("Largest Value:"+largestNum(num));
    }
}
