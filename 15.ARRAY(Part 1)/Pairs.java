public class Pairs {
    public static void printPairs(int [] ar){
        for(int i=0;i<ar.length;i++){

        }
    }
    public static void main(String[] args) {
        //Pairs in an Array
        int tp=0;
        int [] ar={2,4,6,8,10};
        for(int i=0;i<ar.length;i++){
            int cur=ar[i];
            for(int j=i+1;j<ar.length;j++){
                System.out.print("("+cur+","+ar[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs:"+tp);
    }
}
