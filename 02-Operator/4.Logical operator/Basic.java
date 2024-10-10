public class Basic {
    public static void main(String[] args) {
        //Logical Operators
        /*
         * &&(Logical AND)
         * ||(Logical OR)
         * ! (Logical NOT)
         */
        int a=5;
        int b=8;
        //Logical AND
        System.out.println((a<b)&&(b<a));
        //Logical OR
        System.out.println((a>b)||(a<b));
        //Logical NOT
        System.out.println(a!=b);
    }
}
