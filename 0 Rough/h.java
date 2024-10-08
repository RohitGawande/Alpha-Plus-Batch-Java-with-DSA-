public class h {
  public static void bubbleSort(int ar[]){
      for(int i=0;i<ar.length-1;i++){
        for(int j=0;j<ar.length-1-i;j++){
          if(ar[j]>ar[j+1]){
            int temp=ar[j];
            ar[j]=ar[j+1];
            ar[j+1]=temp;
          }
        }
      }
  }
  public static void printAR(int ar[]){
    for(int i=0;i<ar.length;i++){
      System.out.print(ar[i]+" ");
    }
    System.out.println();
  }
   public static void main(String[] args) {
    int [] ar={3,2,9,7,5};
    bubbleSort(ar);
    printAR(ar);
   }
       
    }

