class First{
    public static int fib(int n,int f[]){
        if (n==1||n==0) {
            return n;
        }
        if (f[n]!=0) {
            return f[n];
        }
        f[n]=fib(n-1,f)+fib(n-2,f);
        return f[n];
    }
    public static void main(String[] args) {
        int n=6;
        int f[]=new int[n+1];
        System.out.println("The  of "+n+"Is"+fib(n, f));
        for (int i = 0; i < f.length; i++) {
            System.out.println("f["+i+"]="+f[i]);
        }
    }
}