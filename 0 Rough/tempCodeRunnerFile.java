
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