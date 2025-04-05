class rough1{
    public static int maxArea(int ar[]){
        int left=0;
        int right=ar.length-1;
        int maxAre=0;
        while (left<right) {
            int width=right-left;
            int minHeight=Math.min(ar[left], ar[right]);
            int curAr=width*minHeight;
            maxAre=Math.max(maxAre, curAr);
            if (ar[left]<ar[right]) {
                left++;
            }else{
                right--;
            }
        }
        return maxAre;
    }
    public static void main(String[] args) {
        int ar[]={1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(ar));
    }
}