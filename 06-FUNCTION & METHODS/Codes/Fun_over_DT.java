public class Fun_over_DT {
    //Funtion overloading  with diff data types
    public static int sum(int a,int b) {
        return a+b;
    }
    public static float sum(Float a,Float b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.out.println(sum(6.7f, 4.6f));

    }
}
