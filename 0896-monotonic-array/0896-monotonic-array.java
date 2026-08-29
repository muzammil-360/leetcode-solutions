class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        boolean inc=true;
        boolean dec=true;
        if(n==1)return true;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){dec=false;}
            else if(nums[i-1]>nums[i]){inc=false;}
        }
        if(inc==true||dec==true)return true;
        return false;
    }
}