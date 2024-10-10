public class Q1 {
    //Recursion is a method of solving a computational problem where the 
    //solution depends on solution to smaller instances of the same problem
    /* Steps of Recursion i)Base Case ii)Work ii)inner call */
    public static void PrintDe(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        PrintDe(n-1);
    }
    public static void main(String[] args) {
        //Print no. from n to 1(Decreasing order)
        int n=10;
        PrintDe(n);
    }
}
