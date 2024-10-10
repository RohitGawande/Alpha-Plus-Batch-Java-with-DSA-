
public class Basic {
    public static void main(String[] args) {
        pen p1=new pen();//created a pen object
        p1.setColor("Blue");
        p1.setTip(6);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        // p1.setColor("Yellow");
        p1.color="Yellow";
        System.out.println(p1.color);
        BankAcc myAcc=new BankAcc();
        myAcc.name="Rohit";
        myAcc.Stepass("t");
    }
}
class BankAcc{
    public String name;
    private String Password;
    public void Stepass(String pwd){
        Password=pwd;
    }

}
class pen{
    String color;
    int tip;
    //Getters
    String getcol(){
        return this.color;
    }
    //Setters
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    void Calculate(int phy,int chem,int maths){
        int per=(phy+chem+maths)/3;
    }
}