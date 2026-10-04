class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        //int subset=(int)Math.pow(2,n);
        int subset=1<<n;
        for(int num=0;num<subset;num++){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num & (1<<i))!=0){temp.add(nums[i]);}
            }
            ans.add(temp);
        }
        return ans;
    }
}