class Solution {
    public long findTheArrayConcVal(int[] nums) {
        if(nums.length==1){return nums[0];}
        long ans=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            String str1=String.valueOf(nums[i]);
            String str2=String.valueOf(nums[j]);
            String str=str1+str2;
            ans+=Integer.parseInt(str);
            i++;
            j--;
            if(i==j){
                ans+=Integer.parseInt(String.valueOf(nums[i]));
            }
        }
        return ans;
    }
}