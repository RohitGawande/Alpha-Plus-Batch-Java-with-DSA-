public class Reverse {
    public static void reverse(int [] num){
        int start=0,end=num.length-1;
        while(start<end){
            int temp=num[end];
           num[end]=num[start];
            num[start]=temp;
            start++;
            end--;


        }
    }
    public static void main(String[] args) {
        //Reverse an Array
        int [] num={2,3,4,5,6};
        reverse(num);
        System.out.println("Given Array in reverse order:");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
