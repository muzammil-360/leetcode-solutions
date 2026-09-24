class Solution {
    public int[] transformArray(int[] nums) {
        int even=0;
        int odd=0;
        for(int num:nums){
            if(num%2==0)even++;
            else{odd++;}
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<even;i++){
            ans[i]=0;
        }
        for(int i=even;i<(even+odd);i++){
            ans[i]=1;
        }
        return ans;
    }
}