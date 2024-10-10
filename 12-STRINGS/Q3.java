  public class Q3 {
    public static void main(String[] args) {
        //Lexicographically
        //For a given set of strings ,print the largest string.
        //str.compareTo(str2)     0:equal  <0:-ve  str1<str2
        //    >0:+ve    str1>str2
        String str1="Rohit";
        String str2="Rohit1";
        System.out.println(str1.compareTo(str2));
        String Fruits[]={"Mango","Banana","Apple"};
        String Largest=Fruits[0];
        for(int i=0;i<Fruits.length;i++){
            if(Largest.compareTo(Fruits[i])<0){
                Largest=Fruits[i];
            }
        }
        System.out.println(Largest);
    }
}
