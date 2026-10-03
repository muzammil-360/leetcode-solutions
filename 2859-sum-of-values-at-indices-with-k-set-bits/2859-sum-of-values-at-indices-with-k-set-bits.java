class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int setbits=func(i);
            if(setbits==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
    int func(int n){
        int cnt=0;
        while(n>0){
            n=n & (n-1);
            cnt++;
        }
        return cnt;
    }
    }
