public class Q11 {
    public static int tilingProblem(int n){
        if (n==0|| n==1) {
            return 1;
        }
        //Vertical Choice 
       int fnm1=tilingProblem(n-1);


        //Horizontal Choice 
        int fnm2=tilingProblem(n-2);
        int totalWay=fnm1+fnm2;
        return totalWay;
    }
    public static void main(String[] args) {
        /*   Tiling Problem: Given  2*n board and tiles of size 2*1 ,count the no of
                             ways to tile the given board using the 2*1 tiles.(A tile can 
                             either be placed horizontally or vertically)         */
        System.out.println(4);

    }
}
