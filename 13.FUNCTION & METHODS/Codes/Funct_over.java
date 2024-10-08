public class Funct_over {
    //Function Overloading using Parameter
    public static int Sum(int a,int b) {
    return a+b;        
    }
    public static int Sum(int a,int b, int c) {
        return a+b+c;        
        }
        public static void main(String[] args) {
            System.out.println(Sum(4, 8));
            System.out.println(Sum(5, 7, 8));
        }
}
