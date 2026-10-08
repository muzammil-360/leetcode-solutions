class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int num:nums){
            int val=func(num);
            sum+=val;
        }
        return sum;
    }
    int func(int n){
        int max=-1;
        int cnt=0;
        while(n>0){
            int ld=n%10;
            cnt=cnt*10+1;
            max=Math.max(max,ld);
            n/=10;
        }
        return cnt*max;
    }
}