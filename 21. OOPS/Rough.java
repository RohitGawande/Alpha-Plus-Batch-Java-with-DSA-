public class Rough {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setColor("blue"); 
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        BankAcc myAcc=new BankAcc();
        myAcc.name="Rohit";
        // myAcc.password="h";
        myAcc.setPass("ghd");

    }
}
    class BankAcc{
       public String name;
        private String password;
        public void setPass(String passw){
            password=passw;
        } 
    }
    class pen{
        String color;
        int tip;
        void setColor(String newColor){
            color=newColor;
        }
        void setTip(int newTip){
            tip=newTip;
        }
    }
    class Student{
        int age;
        String name;
        float percentage;
        void calpercent(int phy,int chem,int maths){
            percentage=(phy+chem+maths)/3;
        }
    }

