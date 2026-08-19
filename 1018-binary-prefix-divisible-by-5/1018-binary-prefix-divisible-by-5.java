class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int prefix=0;
        for(int i=0;i<nums.length;i++){
        prefix=((prefix*2)+nums[i])%5;
        ans.add(prefix==0);
        // if(prefix%5==0){
        //     ans.add(true);
        // }
        // else{
        //     ans.add(false);
        // }
        }
        return ans;
    }
}