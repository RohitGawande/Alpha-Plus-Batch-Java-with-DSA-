public class MergeSort {
    public static void prinAr(int ar1[]){
        for(int i=0;i<ar1.length;i++){
            System.out.print(ar1[i]+" ");
        }
    }
    public static void mergeSort(int ar1[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(ar1, si, mid);//left part
        mergeSort(ar1, mid+1, ei);//right part
        merge(ar1, si, mid, ei);
    }
    public static void merge(int ar1[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei) {
            if(ar1[i]<ar1[j]){
                temp[k]=ar1[i];
               
                i++;
            }else{
                temp[k]=ar1[j];
                
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=ar1[i++];
        }
        while (j<=ei) {
            temp[k++]=ar1[j++];
        }
        for(k=0,i=si; k<temp.length;k++,i++){
            ar1[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int ar1[]={6,3,9,5,2,8};
mergeSort(ar1, 0, ar1.length-1);
prinAr(ar1);
    }
}
