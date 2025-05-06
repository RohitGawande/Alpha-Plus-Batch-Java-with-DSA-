public class kk {
   public static void max(int a[][]){
    int max=Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
            if (max<a[i][j]) {
                max=a[i][j];
            }
        }
    }
   }
public static void main(String[] args) {
    
}
     
}