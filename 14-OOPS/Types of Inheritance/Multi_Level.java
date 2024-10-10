
public class Multi_Level {
    //  base claas
 //      |
 //      |
  //  Derived class
  //     |
 //      |
  //  Derived class
  public static void main(String[] args) {
    Dog moti=new Dog();
    moti.eat();
    moti.legs=4;
    System.out.println(moti.legs);
  }
}
class Animal{
    String color;
    void eat(){
      System.out.println("Eats");  
    }
    void breath(){
      System.out.println("breath");  
    }
}
class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
    String breed;
}
