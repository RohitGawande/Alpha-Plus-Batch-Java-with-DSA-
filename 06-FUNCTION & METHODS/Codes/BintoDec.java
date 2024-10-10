public class BintoDec {
    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int dec=0;
        while (binNum>0) {
           int lastNum=binNum%10;
           dec=dec+(lastNum* (int)Math.pow(2, binNum));
           pow++;
           binNum=binNum/10;
        }
        System.out.println("Decimal of"+myNum+" ="+dec);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
