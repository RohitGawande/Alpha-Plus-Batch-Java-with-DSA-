public class l3 {
    public static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        print(n-1);
     
    }
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
}
