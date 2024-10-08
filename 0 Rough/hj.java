public class hj {
    public static int getFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=i*fact;
        }
        return fact;
    }
    public static void main(String[] args) {
     int i= getFactorial(3);
     System.out.println(i);

    }
}
