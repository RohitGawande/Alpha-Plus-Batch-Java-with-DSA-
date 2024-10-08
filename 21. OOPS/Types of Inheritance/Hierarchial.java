 //            base claas
 //             /      \
 //            /        \
  //   Derived class      Derived class
public class Hierarchial {
    public static void main(String[] args) {
      Fish f=new Fish();
      Dog labra=new Dog();
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
  class Fish extends Animal{
     void swim(){
      System.out.println("Swims");
     }
  }
  class Dog extends Animal{
      String breed;
  }
    