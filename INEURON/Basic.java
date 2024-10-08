public class Basic {
   public static void main(String[] args) {
            int [] arr= {10,20,30,40};
            int [][] arr1={{10,20},{30,40,60},{70,80,90,50}};
            for(int elem:arr) {
                System.out.println(elem+" ");
            }
            for(int a[]:arr1){
                for(int elem:a){
                    System.out.print(elem+" ");
                }
                System.out.println();
            }
        }
}
