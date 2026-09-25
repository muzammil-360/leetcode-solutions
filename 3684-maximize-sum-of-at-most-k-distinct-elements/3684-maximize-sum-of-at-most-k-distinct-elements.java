class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> ls=new ArrayList<>();
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                if(k==0){break;}
                ls.add(nums[i+1]);
                k--;
            }
        }
        if(k!=0){ls.add(nums[0]);}
        int[] ans=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}