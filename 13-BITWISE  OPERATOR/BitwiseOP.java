public class BitwiseOP {
    /* Binary AND &
       Binary OR  |
     * Binary XOR  ^
     * Binary One's compliment ~
     * Binary Left Shift <<
     * Binary Right Shift  >>
     */
    //And
    public static void main(String[] args) {
        System.out.println("AND :"+(5&6));
        System.out.println("OR :"+(5 | 6));
        System.out.println("XOR :"+(5 ^ 6));//same bit-->0
        System.out.println("Binary One's compliment ~ :"+(~5)); //1 (-)  0(+)
        System.out.println("Binary Left Shift << :"+(5<<2));// a<<b=a*(2^b)
        System.out.println("Binary Right Shift << :"+(6>>1));  //a>>b=a/2^b
    }
}
