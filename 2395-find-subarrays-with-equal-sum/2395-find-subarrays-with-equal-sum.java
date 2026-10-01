class Solution {
    public boolean findSubarrays(int[] nums) {
        int n=nums.length;
        if(n<=2)return false;
        int i=0;
        int j=1;
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        while(i<n && j<n){
            sum=nums[i]+nums[j];
            if(set.contains(sum)){return true;}
            else{
                set.add(sum);
            }
            i++;
            j++;
        }
        return false;
    }
}