
public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Fish f=new Fish();
        f.breath();
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
    class Tuna extends Fish{
        void swim(){
         System.out.println("Swim Faster");
        }
     }
    class shark extends Fish{
        void eat(){
            System.out.println("Eat ");
        }
    }
    class Bird extends Animal{
        void fly(){
            System.out.println("Birds fly");
        }
    }
    class Peecock extends Bird{
        String name;
    }
    class Mammal extends Animal{
        int leg;
    }
    class Dog extends Mammal{
        void bark(){
            System.out.println("Dog is barking");
        }
    }
    class Cat extends Mammal{
        void meow(){
            System.out.println("Cat is meowing");
        }
    }
    class Human extends Mammal{
        void talk(){
            System.out.println("Human is Talking");
        }
    }

