class Solution {
    public int findMaxK(int[] nums) {
        // HashSet<Integer> st=new HashSet<>();
        // for(int num:nums){
        //     st.add(num);
        // }
        // int ans=Integer.MIN_VALUE;
        // for(int num:st){
        //     if(num>0){
        //         if(st.contains(-num)){
        //             ans=Math.max(ans,num);
        //         }
        //     }
        // }
        // if(ans!=Integer.MIN_VALUE)return ans;
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==0)return nums[r];
            else if(sum>0)r--;
            else{l++;}
        }
        return -1;
    }
}