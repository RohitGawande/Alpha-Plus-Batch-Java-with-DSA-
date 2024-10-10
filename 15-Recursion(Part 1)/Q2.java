public class Q2 {
    public static void IncreasingNo(int n) {
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        IncreasingNo(n+1);
    }
    public static void main(String[] args) {
      int  n=1;
        IncreasingNo(n);
    }
}
