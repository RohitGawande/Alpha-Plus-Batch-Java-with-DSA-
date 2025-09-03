public class Decreasing {
    public static void DecreasingNo(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        DecreasingNo(n-1);
    }
    public static void main(String[] args) {
      int  n=1;
        DecreasingNo(n);
    }
}
