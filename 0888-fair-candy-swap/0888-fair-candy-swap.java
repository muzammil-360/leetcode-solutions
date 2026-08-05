class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int suma=0;
        for(int i=0;i<aliceSizes.length;i++){
            suma+=aliceSizes[i];
        }
        int sumb=0;
         for(int i=0;i<bobSizes.length;i++){
            sumb+=bobSizes[i];
        }
       int d=(suma-sumb)/2;
       int l=0;
       int m=0;
       while(l<aliceSizes.length && m<bobSizes.length){
        int diff=aliceSizes[l]-bobSizes[m];
        if(diff<d){l++;}
        else if(diff>d){m++;}
        else{
            // int[] ans={aliceSizes[l],bobSizes[m]};
            // return ans;
             return new int[]{aliceSizes[l], bobSizes[m]};
        }
       }
       return new int[0];
    }
}