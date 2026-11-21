class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        } 
        int maxfreq=0;
        for(int num:map.keySet()){
            maxfreq=Math.max(maxfreq,map.get(num));
        }
        int ans=Integer.MAX_VALUE;
        for(int num:map.keySet()){
            if(map.get(num)==maxfreq){
                int first=0;
                int last=0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==num){first=i;break;}
                }
                for(int i=nums.length-1;i>=0;i--){
                    if(nums[i]==num){last=i;break;}
                }
                ans=Math.min(ans,last-first+1);
            }
        }
        return ans;
    }
}