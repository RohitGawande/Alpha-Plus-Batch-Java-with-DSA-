import Constructor.Student;

public class Shallow {
    public static void main(String[] args) {
        Student s1=new Student();
        // Student s2=new Student("Rohit");
        // Student s3=new Student(5);
        s1.roll=5;
        s1.name="rohit";
        s1.passw="jdnjng";
        s1.marks[0]=90;
        s1.marks[1]=90;
        s1.marks[2]=90;
        Student s2=new Student(s1);
        s2.passw="fdkf";
        s1.marks[2]=50;
        for(int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }
    }
}
class Student{
    int age;
    String name;
     int roll;
     String passw;
     int marks[]; 
    Student(String name){
        this.name=name;
        this.roll=roll;
        marks=new int[3];
    }
    //Non Parametrized Constructor
    Student(){
        marks=new int[3];
       System.out.println("Constructor is called..."); 
    }

    // Parametrized Constructor
    Student(int roll){
        
        marks=new int[3];
        this.roll=roll;
    }
    // Shallow Copy Constructor
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
         
    // }
    //Deeep Copy Constructor
 Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
}
}
