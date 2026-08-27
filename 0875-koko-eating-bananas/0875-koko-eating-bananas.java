class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        // for(int k=1;k<=max;k++){
        //     int hr=cnthr(piles,k);
        //     if(hr<=h)return k;
        // }
        int low=1;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int hr=cnthr(piles,mid);
            if(hr<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    int cnthr(int[] piles,int hour){
        int counthr=0;
        for(int i=0;i<piles.length;i++){
            counthr+=Math.ceil((double)piles[i]/(double)hour);
        }
        return counthr;
    }
}