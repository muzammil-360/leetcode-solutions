class Solution {
    public int maxDigitRange(int[] nums) {
        int drange=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            while(temp>0){
                int ld=temp%10;
                temp/=10;
                min=Math.min(min,ld);
                max=Math.max(max,ld);
            }
            int diff=max-min;
            drange=Math.max(drange,diff);
        }
        int maxNum=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            while(temp>0){
                int ld=temp%10;
                temp/=10;
                min=Math.min(min,ld);
                max=Math.max(max,ld);
            }
            int diff=max-min;
            if(diff==drange){
                maxNum+=nums[i];
            }
        }
        return maxNum;
    }
}