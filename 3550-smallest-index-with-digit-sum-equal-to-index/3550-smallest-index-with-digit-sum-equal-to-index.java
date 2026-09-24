class Solution {
    public int smallestIndex(int[] nums) {
        int ind=-1;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int sum=0;
            while(temp>0){
                int ld=temp%10;
                sum+=ld;
                temp/=10;
            }
            if(sum==i){ind=i;break;}
        }
        return ind;
    }
}