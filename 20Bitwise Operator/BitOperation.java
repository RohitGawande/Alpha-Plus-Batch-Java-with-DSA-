public class BitOperation {
    //Get I'th bit
    public static int  GetIthbit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)== 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    //Set I'th bit
    
    public static void main(String[] args) {
        System.out.println(GetIthbit(10, 3));
    }
}
