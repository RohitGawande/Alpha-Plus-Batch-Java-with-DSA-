package Polymorphism;

public class Method_Overloading {
    /* Multiple function with same name but different parameters */
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.sum(7, 2));
        System.out.println(cal.sum(7,5,8));
        System.out.println(cal.sum(1.1f, 2.2f));
    }
    
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
