public class jj {
    public static int getFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=i*fact;
        }
        return fact;
    }
    public static int calBinoCoeff(int n,int r){
        int n_fact=getFactorial(n);
        int r_fact=getFactorial(r);
        int nmr_fact=getFactorial(n-r);
        System.out.println(n_fact);
        System.out.println(r_fact);
        System.out.println(nmr_fact);
        int Binomial_Coefficient=+((n_fact)/(r_fact*nmr_fact));
        return Binomial_Coefficient;
    }
    public static void main(String[] args) {
       System.out.println("Binomial Coefficient"+calBinoCoeff(5, 2));
    }
}
