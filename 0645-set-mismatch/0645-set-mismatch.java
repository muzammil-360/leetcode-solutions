class Solution {
    public int[] findErrorNums(int[] nums) {
        long n=nums.length;
        long sn=n*(n+1)/2;
         long sn2=(n*(2*n+1)*(n+1))/6;
         long s=0;
         long s2=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            s2+=nums[i]*nums[i];
        }
        long val1=s-sn;
        long val2=s2-sn2;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=val2-x;
        return new int[]{(int)x,(int)y};
    }
}