public class Inheritance {
   // Inheritance is when properties and
   // methods of base class are passed on to a derived class
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
    }
}
//Base Class
class Animal{
    String color;
    void eat(){
      System.out.println("Eats");  
    }
    void breath(){
      System.out.println("breath");  
    }
}
//Derived class or subclass
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}