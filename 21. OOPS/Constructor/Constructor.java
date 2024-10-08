package Constructor;
/*Constructor is a special method which is invoked automatically at the time of object creation .
     * constructor have the same name as class or structure
     * constructor don't have a return type.(not even void)
     * Contructor are only called once,at object creation
     * Memory allocation happens when constructor is called.
     */
public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student("Rohit");
        System.out.println(s1.name);
    }
    
}
class Student{ 
    String name;
    int age;
    Student(String name){
         this.name=name;
    }
}
