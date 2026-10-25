class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfies=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                satisfies+=customers[i];
            }
        }
        int l=0;
        int sum=0;
        int maxsum=0;
        for(int r=0;r<grumpy.length;r++){
            if(grumpy[r]==1){
                sum+=customers[r];
            }
            if(r-l+1>minutes){
                if(grumpy[l]==1){
                    sum-=customers[l];
                }
                l++;
            }
            maxsum=Math.max(maxsum,sum);
        }
        return satisfies+maxsum;
    }
}