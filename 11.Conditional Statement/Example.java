public class Example {
    public static void main(String[] args) {
        int age=18;
        if(age>=18){
            System.out.println("You can vote.");
        } else if(age>=13 && age<16){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
