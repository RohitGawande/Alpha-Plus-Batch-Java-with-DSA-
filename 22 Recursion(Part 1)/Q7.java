public class Q7 {
    public static int firtsOccurence(int ar[],int key,int i){
       if(i==ar.length-1){
        return -1;
       }
        if(ar[i]==key){
            return i;
        }
        return firtsOccurence(ar, key, i+1);
    }
    public static void main(String[] args) {
        //WAF to find the first occurence of an element in an array
        int ar[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firtsOccurence(ar, 5, 0));
    }
}
