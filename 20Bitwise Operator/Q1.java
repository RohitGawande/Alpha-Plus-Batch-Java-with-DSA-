public class Q1 {
    //FOR Odd(LSB =1)  for even (LSB=0)   n&0=0
    public static void EvenOrOdd(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        EvenOrOdd(3);
        EvenOrOdd(4);
        EvenOrOdd(5);
    }
}
